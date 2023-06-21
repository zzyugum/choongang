package account0621;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SelectListDao {

	void slectlist() {
		ArrayList<AccountDto> list = new ArrayList<>();

		LoginDao li = new LoginDao();
		li.login();
		String sql = "Select * From Account";
		ResultSet rs;

		try {
			rs = li.stmt.executeQuery(sql);
			while (rs.next()) {
				String name = rs.getString("name");
				int num = rs.getInt("accnum");
				int deposit = rs.getInt("deposit");
				AccountDto dto = new AccountDto(num,name,deposit);
				list.add(dto);
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		for(AccountDto dto1 : list) {
			System.out.println(dto1);
		}
		

	}

}
