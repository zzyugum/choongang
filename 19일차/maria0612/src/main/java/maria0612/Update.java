package maria0612;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {

	public String[] update(int id) throws ClassNotFoundException, SQLException{
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
			String sql = "SELECT * FROM person where id = "+id;
			rs = stmt.executeQuery(sql);
			if (rs.next()) {
				String name = rs.getString("name");
				String addr = rs.getString("addr");
				String phon = rs.getString("phon");
				String[] result = new String[3];
					result[0] = name;
					result[1] = addr;
					result[2] = phon;
				return result;
				
		}
		return null;
		
		
	}

}


