package table0620;

import java.sql.SQLException;

public class InsertDao {

	void insert(Dto dto) throws ClassNotFoundException, SQLException {
		LoginDao login = new LoginDao();
		login.logindao();
		String sql = "Insert into person(name, addr, phon) values ('"
										+dto.getName()+"','"+dto.getAddr()+"','"+dto.getPhon()+"')";
		login.stmt.executeUpdate(sql);
	}
	
	
}
