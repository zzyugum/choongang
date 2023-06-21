package table0620;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectOne {

	Dto selectOne(int num) throws SQLException, ClassNotFoundException {

		LoginDao login = new LoginDao();
		login.logindao();
		ResultSet rs = login.stmt.executeQuery("Select * From person where id = " + num);
		if (rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			String addr = rs.getString("addr");
			String phon = rs.getString("phon");
			Dto dto = new Dto(id, name, addr, phon);
			return dto;
		} else {
			return new Dto(-1, null, null, null);
		}

		

	}
}