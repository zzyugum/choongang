package oracle0622;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Select {
ResultSet rs;
	ResultSet select() {
		Login lg = new Login();
		lg.login();
		String sql = "select * from emp";
		
		try {
			rs = lg.stmt.executeQuery(sql);
			while (rs.next()) {
				String hiredate = rs.getDate("HIREDATE")+"";	
				String name = rs.getString("ENAME");
				String nom = rs.getString("EMPNO");
				String job = rs.getString("JOB");
				String mgr = rs.getString("MGR");
				String sal = rs.getString("SAL");
				String comm = rs.getString("COMM");
				String deptno = rs.getString("DEPTNO");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;

	}

}
