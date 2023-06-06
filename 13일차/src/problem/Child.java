package problem;

public class Child extends Parent{

	private String name;
	
	public Child() {
		this("홍길동");
		System.out.println("child() call");
	}
	public Child(String name) {
		this.name = name;
		System.out.println("child(String name) call");
	}
	
}
