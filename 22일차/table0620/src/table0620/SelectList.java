package table0620;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SelectList {

	void selectList() throws ClassNotFoundException, SQLException {
		ArrayList<Dto> list = new ArrayList<>();

		LoginDao login = new LoginDao();
		login.logindao();
		ResultSet rs = login.stmt.executeQuery("Select * from person");
		while (rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			String addr = rs.getString("addr");
			String phon = rs.getString("phon");
			Dto dto = new Dto(id, name, addr, phon);
			list.add(dto);
		}
		for (Dto a : list) {
			System.out.println(a);
		}
	}
		
	}
	

