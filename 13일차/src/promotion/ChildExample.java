package promotion;

public class ChildExample {

	public static void main(String[] args) {

		Child child = new Child();
		
		Parent parent = child; //자동 형변환
		parent.method1();
		parent.method2();
		
		Child ch = (Child) parent; // 강제 형변환
		
		ch.method3();
	}

}
