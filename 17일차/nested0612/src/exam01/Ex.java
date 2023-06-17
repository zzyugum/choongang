package exam01;

public class Ex {

	public static void main(String[] args) {
		
		A a = new A();
		A.B b = a.new B();
		b.field1 = 10;
		
//		A.B b1 = new A().new B(); // 두개 같은 내용
		A.C c = new A.C();
		a.method();
		c.field1 = 0;
		A.C.method();
	}

}
