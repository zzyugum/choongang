package swing0613;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Sel {
    public Sel(Connection con) throws SQLException, ClassNotFoundException {
		Statement stmt = con.createStatement();
		ResultSet rs = null;
		String sql = "select * from person";
		rs = stmt.executeQuery("SELECT * FROM person");
			while(rs.next()) {
					String name = rs.getString("name");
					String addr = rs.getString("addr");
					String phon = rs.getString("phon");
					System.out.println(name+"  "+addr+"  "+phon);
		}
			
		
}
}
