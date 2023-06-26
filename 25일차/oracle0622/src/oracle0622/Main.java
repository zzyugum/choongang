package oracle0622;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "Scott";
		String pass = "tiger";
		Connection con;
		Statement stmt;
		ResultSet rs;
		String sql = "select * from emp";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, id, pass);
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				String hiredate = rs.getDate("HIREDATE")+"";	
				String name = rs.getString("ENAME");
				String nom = rs.getString("EMPNO");
				String job = rs.getString("JOB");
				String mgr = rs.getString("MGR");
				String sal = rs.getString("SAL");
				String comm = rs.getString("COMM");
				String deptno = rs.getString("DEPTNO");
				System.out.printf("번호 =%s 이름=%s, 직업=%s, MGR=%s, 입사일=%s, 급여=%s, COMM=%s, DEPTNO=%s \n",nom,name,job,mgr,hiredate,sal,comm,deptno );
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
