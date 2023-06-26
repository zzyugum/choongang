package oracle0622;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Login {
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String id = "Scott";
	String pass = "tiger";
	Connection con;
	Statement stmt;
	void login() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url,id,pass);
			stmt = con.createStatement();
		} catch (ClassNotFoundException|SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
		
}
