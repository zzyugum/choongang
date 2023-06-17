package maria0612;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateEx02 {
	public void ud(int id,String name, String addr, String phon) throws ClassNotFoundException, SQLException {
		Connection con = null;
		String url = "jdbc:mariadb://localhost:3307/jspdb";
		String user = "root";
		String pass = "maria";
		Class.forName("org.mariadb.jdbc.Driver");
		System.out.println("드라이버 로딩!");
		con = DriverManager.getConnection(url, user, pass);
		System.out.println("접속 성공!");
		Statement stmt = con.createStatement();
		ResultSet rs = null;
		String sql = "UPDATE person SET NAME = '"+name+"' , addr ="
				+ " '"+addr+"', phon = '"+phon+"' WHERE id = "+id;
		stmt.executeUpdate(sql);
		
	}
	
}
