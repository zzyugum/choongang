package table0620;

import java.sql.SQLException;

public class UpdateDao {

	void updatedao(Dto dto) throws ClassNotFoundException, SQLException {

		LoginDao login = new LoginDao();
		login.logindao();
		String sql = "Update person Set name = '" + dto.getName() + "', addr = '" + dto.getAddr() + "', phon = '"
				+ dto.getPhon() + "' where id = " + dto.getId();
		login.stmt.executeUpdate(sql);

	}

}
