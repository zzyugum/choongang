package swing0614;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {
	Connection con = null;
	
	public int insert(String name, String addr,String phon) throws ClassNotFoundException, SQLException{
		String url = "jdbc:mariadb://localhost:3307/jspdb";
		String user = "root";
		String pass = "maria";
		Class.forName("org.mariadb.jdbc.Driver");
		System.out.println("드라이버 로딩!");
		con = DriverManager.getConnection(url, user, pass);
		System.out.println("접속 성공!");
		Statement stmt = con.createStatement();
		String sql = "insert into person (name,addr,phon) values"
				+"('"+name+"','"+addr+"','"+phon+"')";
		return stmt.executeUpdate(sql);
//		int res = stmt.executeUpdate(sql);
//		if(res == 1) {
//			
//			response.sendRedirect("list.jsp");
		
	}
	
}
