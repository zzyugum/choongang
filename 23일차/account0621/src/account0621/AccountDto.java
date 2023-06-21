package account0621;

public class AccountDto {
	private int accnum;
	private String name;
	private int deposit;

	@Override
	public String toString() {
		return "AccountDto [accnum=" + accnum + ", name=" + name + ", deposit=" + deposit + "]";
	}

	public AccountDto(int accnum, String name, int deposit) {
		super();
		this.accnum = accnum;
		this.name = name;
		this.deposit = deposit;
	}

	public int getAccnum() {
		return accnum;
	}

	public void setAccnum(int accnum) {
		this.accnum = accnum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDeposit() {
		return deposit;
	}

	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}

}
