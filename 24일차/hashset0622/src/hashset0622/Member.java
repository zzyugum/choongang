package hashset0622;

import java.util.Objects;

public class Member {

	public String name;
	public int age;

	public Member(String name, int age) {

		this.age = age;
		this.name = name;

	}

	@Override
	public int hashCode() {
		System.out.println(this +"1");
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println(this + "2");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return age == other.age && Objects.equals(name, other.name);
	}

//	@Override
//	public boolean equals(Object obj) {
//
//		if (obj instanceof Member) {
//			Member member = (Member) obj;
//			return member.name.equals(name) && (member.age == age);
//		} else {
//			return false;
//		}
//	}
//
//	@Override
//	public int hashCode() {
//		return name.hashCode() + age;
//	}

}
