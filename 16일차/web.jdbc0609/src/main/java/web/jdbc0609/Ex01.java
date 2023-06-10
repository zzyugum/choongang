package web.jdbc0609;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Ex01 {
	int empno = 0;
	String ename = null;
	int sal = 0;
	String phon = null;
	Connection con = null;
	String url = "jdbc:mariadb://localhost:3307/jspdb";
	String user = "root";
	String pass = "maria";
	
	public Ex01(int empno, String ename, int sal, String phon) throws ClassNotFoundException, SQLException {

		this.empno = empno;
		this.ename = ename;
		this.sal = sal;
		this.phon = phon;
		String url = "jdbc:mariadb://localhost:3307/jspdb";
		String user = "root";
		String pass = "maria";
		Class.forName("org.mariadb.jdbc.Driver");
		System.out.println("드라이버 로딩!");
		con = DriverManager.getConnection(url, user, pass);
		System.out.println("접속 성공!");
		String sql = "INSERT INTO emp(empno,ename,sal,phon)"
				+"VALUES("+empno + ", '"+ename+"',"+sal+","+phon+")";
		Statement stmt = con.createStatement();
		stmt.executeUpdate(sql);
		System.out.println(sql);
		System.out.println("query 성공");
	}

}


