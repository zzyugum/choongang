package swing0613;

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
import javax.swing.JMenu;
import javax.swing.JTextField;


public class Win extends JFrame{
	
	JLabel la = new JLabel("검색");
	JButton bt = new JButton("클릭");
	JTextField tf = new JTextField("여기에");
	Win() throws SQLException, ClassNotFoundException{
		
		String url = "jdbc:mariadb://localhost:3307/jspdb";
		String user = "root";
		String pass = "maria";
		Connection con = DriverManager.getConnection(url, user, pass);
		Class.forName("org.mariadb.jdbc.Driver");
		System.out.println("드라이버 로딩!");
		System.out.println("접속 성공!");
		Container c = this.getContentPane();
		this.setLayout(null);
		this.setTitle("처음 윈도우");
		this.setLocation(600, 400);
		this.setSize(300, 300);
		this.setVisible(true);
		la.setSize(50, 20);
		la.setLocation(30, 30);
		c.add(la);
		bt.setSize(100,40); //폭, 높이
		bt.setLocation(100, 30); //가로 , 세로
		c.add(bt);
		tf.setSize(60, 20);
		tf.setLocation(100, 100);
		c.add(tf);
		bt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
					try {
						Sel sel = new Sel(con);
					} catch (ClassNotFoundException | SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
	
				
				
				
				
				
			}
			
			
		});
	}

//	private class MyActionListener implements ActionListener{
//
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			System.out.println("클릭!");
//			
//		}
//	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		new Win();

	}

}
