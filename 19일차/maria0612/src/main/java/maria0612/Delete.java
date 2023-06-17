package maria0612;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {

	public void delete(int id) throws ClassNotFoundException, SQLException {
	String url = "jdbc:mariadb://localhost:3307/jspdb";
	String user = "root";
	String pass = "maria";
	Class.forName("org.mariadb.jdbc.Driver");
    Connection connection = DriverManager.getConnection(url, user, pass);
    Statement statement = connection.createStatement();
 	   statement.executeUpdate("DELETE FROM person WHERE id = " + id);
	}
}

	
