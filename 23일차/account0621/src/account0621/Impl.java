package account0621;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Impl {

	SelectOneDao dao = new SelectOneDao();

	int max() {
		int max = 0;
		LoginDao login = new LoginDao();
		login.login();
		try {
			String sql = "SELECT MAX(accnum) FROM account";
			ResultSet rs = 
			login.stmt.executeQuery(sql);
			if(rs.next()) {
			max = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return max;
		
	}
	
	void insert(int acc, String name) {
		AccountDto dto = new AccountDto(acc, name, 0);
		AccountInsertDao is = new AccountInsertDao();
		is.insert(dto);
	}
	
	
	int check(int num) {

		AccountDto dto = dao.selone(num);
		return dto.getDeposit();
	}

	void update(int num1, int num2) {
		UpdateDao ud = new UpdateDao(num1);
		ud.update(num1, num2);
	}

	void withdraw(int num1, int num2) {

		if (check(num1) - num2 >= 0) {
			UpdateDao ud = new UpdateDao(num1);
			ud.update(num1, check(num1) - num2);
		} else {
			System.out.println("잔액이 부족합니다");
		}
	}

}
