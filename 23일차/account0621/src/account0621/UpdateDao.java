package account0621;

import java.sql.SQLException;

public class UpdateDao {
	LoginDao login = new LoginDao();
	SelectOneDao sel = new SelectOneDao();
	

	UpdateDao(int num) {
		login.login();
		
	}

	void update(int num, int deposit) {
		String sql = String.format("Update account set deposit = %d where accnum = %d", deposit, num);
		try {
			login.stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
