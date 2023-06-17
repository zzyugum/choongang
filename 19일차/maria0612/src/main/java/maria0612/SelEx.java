package maria0612;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelEx {
    public String[] selEx(int i) throws SQLException, ClassNotFoundException {
        Connection con = null;
        String url = "jdbc:mariadb://localhost:3307/jspdb";
        String user = "root";
        String pass = "maria";
        Class.forName("org.mariadb.jdbc.Driver");
        System.out.println("드라이버 로딩!");
        con = DriverManager.getConnection(url, user, pass);
        System.out.println("접속 성공!");
        Statement stmt = con.createStatement();
        String sql = "select * from person where = "+ i;
        ResultSet rs = stmt.executeQuery(sql);
        
        String[] result = new String[3]; // name, addr, phon을 담을 배열
        
        while (rs.next()) {
            String name = rs.getString("name");
            String addr = rs.getString("addr");
            String phon = rs.getString("phon");
            
            result[0] = name;
            result[1] = addr;
            result[2] = phon;
        }

        return result;
    }
}
