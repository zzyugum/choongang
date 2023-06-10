package jdbc0609;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestForJDBC {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con = null;
		String url = "jdbc:mariadb://localhost:3307/jspdb";
		String user = "root";
		String pass = "maria";
		Class.forName("org.mariadb.jdbc.Driver");
		System.out.println("드라이버 로딩!");
		con = DriverManager.getConnection(url, user, pass);
		System.out.println("접속 성공!");
		
		String sql = "INSERT INTO emp(empno, ename, sal, phon)\r\n"
				+ "VALUES (1002, '홍길동', 30000,'010-1234-1234')";
		System.out.println(sql);
		Statement stmt = con.createStatement();
		stmt.executeUpdate(sql);
		System.out.println("query 성공");
	}

}
