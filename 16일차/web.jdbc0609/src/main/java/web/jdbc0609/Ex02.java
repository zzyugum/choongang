package web.jdbc0609;

import java.sql.*;
public class Ex02 {
	
	
	public Ex02() throws SQLException{
	String url = "jdbc:mariadb://localhost:3307/jspdb";
	String user = "root";
	String pass = "maria";
    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;
	connection = DriverManager.getConnection(url, user, pass);
	statement = connection.createStatement();
	resultSet = statement.executeQuery("SELECT * FROM emp");
	while (resultSet.next()) {
		resultSet.getString("empno");
		resultSet.getString("ename");
		resultSet.getString("sal");
		resultSet.getString("phon");
	}
	resultSet.close();
	statement.close();
	connection.close();
}
}
