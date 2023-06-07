package web.polymorphism0606;

public class Person {

	private String name;
	private String adress;
	private String phon;
	private String email;
	private int birthday; // 19880607
	
	public Person() {}
	
	
	public Person(String name, String adress, String phon, String email, int birthday) {
		super();
		this.name = name;
		this.adress = adress;
		this.phon = phon;
		this.email = email;
		this.birthday = birthday;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", adress=" + adress + ", phon=" + phon + ", email=" + email + ", birthday="
				+ birthday + "]";
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getPhon() {
		return phon;
	}
	public void setPhon(String phon) {
		this.phon = phon;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getBirthday() {
		return birthday;
	}
	public void setBirthday(int birthday) {
		this.birthday = birthday;
	}
	
}
