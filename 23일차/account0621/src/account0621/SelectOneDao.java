package account0621;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectOneDao {

	AccountDto selone(int x) {
		try {
			LoginDao login = new LoginDao();
			login.login();
			String sql = String.format("Select * from account where accnum = %d", x);
			ResultSet rs = login.stmt.executeQuery(sql);
			if (rs.next()) {
				String name = rs.getString("name");
				int num = rs.getInt("accnum");
				int deposit = rs.getInt("deposit");
				AccountDto dto = new AccountDto(num, name, deposit);
				return dto;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return new AccountDto(-1, null, 0);
	}
}
