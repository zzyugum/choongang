package core.member;

public class Member {

	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", grade=" + grade + "]";
	}

	private Long id; // 회원 아이디
	private String name; // 회원 이름
	private Grade grade; // 회원 등급

	public Member(Long id, String name, Grade grade) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}

}
