package account0621;

import java.sql.SQLException;

public class AccountInsertDao {

	void insert(AccountDto dto){
		try {
		LoginDao li = new LoginDao();
		li.login();
		String sql = "Insert into account(accnum, name, deposit) values ("+dto.getAccnum()+",'"+dto.getName()+"', 0)";
		li.stmt.executeUpdate(sql);
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
}


