package overrideing0602;

public class Parent {
	
	int x;

	public Parent(int x) {
		super();
		this.x = x;
	}
	
	void print() {
			
		}
	//final,private가 붙으면 오버라이딩 불가능
	final int total() {
		
		return 100;
	}
}
