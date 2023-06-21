package table0620;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginDao {

	Connection con;
	Statement stmt;
	String url = "jdbc:mariadb://localhost:3307/jspdb";
	String id = "root";
	String pass = "maria";

	void logindao() throws ClassNotFoundException, SQLException {
		Class.forName("org.mariadb.jdbc.Driver");
		con = DriverManager.getConnection(url, id, pass);
		stmt = con.createStatement();
	}
}
