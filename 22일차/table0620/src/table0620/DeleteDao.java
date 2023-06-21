package table0620;

import java.sql.SQLException;

public class DeleteDao {

	void delete(Dto dto) throws SQLException, ClassNotFoundException {
		LoginDao login = new LoginDao();
		login.logindao();
		String sql = "Delete From person Where id = "+dto.getId();
		login.stmt.executeUpdate(sql);
	}
	
}
