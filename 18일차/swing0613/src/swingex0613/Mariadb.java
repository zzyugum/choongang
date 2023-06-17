package swingex0613;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Mariadb extends JFrame{

	JLabel la = new JLabel("PERSON 검색");
	JTextField tf = new JTextField("");
	JButton btn = new JButton("조회");
	Connection con;
	Mariadb() throws SQLException, ClassNotFoundException{
		String url = "jdbc:mariadb://localhost:3307/jspdb";
		String user = "root";
		String pass = "maria";
		Class.forName("org.mariadb.jdbc.Driver");
		System.out.println("드라이버 로딩!");
		con = DriverManager.getConnection(url, user, pass);
		System.out.println("접속 성공");
		
		Container c = this.getContentPane();	
		this.setLayout(null);
		this.setTitle("검색 화면");
		this.setSize(300, 300);
		this.setLocation(500, 500);
		this.setVisible(true);
		la.setSize(100, 30);
		la.setLocation(30, 0);
		c.add(la);
		tf.setSize(100, 30);
		tf.setLocation(30, 30);
		c.add(tf);
		btn.setSize(100, 30);
		btn.setLocation(30,60);
		c.add(btn);
		
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(tf.getText());
				String str = tf.getText();
				try {
					Statement stmt = con.createStatement();
					String sql = "select * from person " + "where name like '%"+str+"%'";
					ResultSet rs = stmt.executeQuery(sql);
					while(rs.next()) {
						int id = rs.getInt("id");
						String name = rs.getString("name");
						String addr = rs.getString("addr");
						String phon = rs.getString("phon");
						System.out.printf("%d,%s,%s,%s\n",id, name, addr, phon);
					}
				} catch (SQLException e1) {
					
					e1.printStackTrace();
				}
				
			}
			
		});
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		new Mariadb();
		
		
	
		
		
		
		
		
		
		
	}
	
	
}
