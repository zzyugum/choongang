package swing0614;

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
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class WinPerson extends JFrame{
		String id;
		String name;
		String addr;
		String phon;
		JLabel la1 = new JLabel("id");
		JLabel la2 = new JLabel("name");
		JLabel la3 = new JLabel("addr");
		JLabel la4 = new JLabel("phon");
		JTextField tf1 = new JTextField(id);
		JTextField tf2 = new JTextField(name);
		JTextField tf3 = new JTextField(addr);
		JTextField tf4 = new JTextField(phon);
		JButton bt1 = new JButton("검색");
		JButton bt2 = new JButton("입력");
		JButton bt3 = new JButton("수정");
		JButton bt4 = new JButton("삭제");
		JTextArea ta = new JTextArea();
		Connection con = null;

		WinPerson() throws ClassNotFoundException, SQLException{
			//SelEx selex = new SelEx();
			//String a = selex.selEx(17)[2];
	        String url = "jdbc:mariadb://localhost:3307/jspdb";
	        String user = "root";
	        String pass = "maria";
	        Class.forName("org.mariadb.jdbc.Driver");
	        System.out.println("드라이버 로딩!");
	        con = DriverManager.getConnection(url, user, pass);
	        System.out.println("접속 성공!");
			//윈도우 기초 패널
			Container c = this.getContentPane();
			//컴포넌트를 임의의 위치에 고정시키려고
			this.setLayout(null);
			this.setTitle("Person crud");
			this.setSize(680, 300);
			this.setLocation(500, 500);
			this.setVisible(true);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			tf1.setSize(100,25 );
			tf1.setLocation(100, 40);
			c.add(tf1);
			la1.setSize(80, 30);
			la1.setLocation(140, 10);
			c.add(la1);
			tf2.setSize(100,25 );
			tf2.setLocation(220, 40);
			c.add(tf2);
			la2.setSize(80, 30);
			la2.setLocation(255, 10);
			c.add(la2);
			tf3.setSize(100,25 );
			tf3.setLocation(340, 40);
			c.add(tf3);
			la3.setSize(80, 30);
			la3.setLocation(380, 10);
			c.add(la3);
			tf4.setSize(100,25 );
			tf4.setLocation(460, 40);
			c.add(tf4);
			la4.setSize(80, 30);
			la4.setLocation(495, 10);
			c.add(la4);
			bt1.setSize(60,20);
			bt1.setLocation(10, 240);
			c.add(bt1);
			bt2.setSize(60,20);
			bt2.setLocation(80, 240);
			c.add(bt2);
			bt3.setSize(60,20);
			bt3.setLocation(150, 240);
			c.add(bt3);
			bt4.setSize(60,20);
			bt4.setLocation(220, 240);
			c.add(bt4);
			bt1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
			        Statement stmt = null;
					try {
						ta.setText("");
						stmt = con.createStatement();
						String qstr1 = tf2.getText();
						String qstr2 = tf3.getText();
						String qstr3 = tf4.getText();
						String sql ="SELECT * FROM person WHERE NAME LIKE '%"+qstr1+"%'"
								+ "and addr LIKE '%"+qstr2 +"%'"
								+ "and phon LIKE '%"+qstr3 +"%'";
						String s1 = tf1.getText();
						if(!(tf1.getText()).equals("")) {
				        sql = "SELECT * FROM person where id = "+ s1;
						}
				        ResultSet rs = stmt.executeQuery(sql);
				        while(rs.next()) {
				        int id = rs.getInt("id");
				        String name = rs.getString("name");
				        String addr = rs.getString("addr");
				        String phon = rs.getString("phon");
				        String str = String.format("%d,%s,%s,%s\n"
				        		,id, name, addr, phon);
				        ta.append(str);
				        }
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
				}
			});
			JScrollPane scrollPane = new JScrollPane(ta) ;
			ta.setCaretPosition(ta.getDocument().getLength());
			scrollPane.setSize(460,80);
			scrollPane.setLocation(100, 100);
			c.add(scrollPane);
		}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
			
			WinPerson w1 = new WinPerson();
		
		

	}

}
