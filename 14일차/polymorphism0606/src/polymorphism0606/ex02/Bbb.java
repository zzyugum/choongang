package polymorphism0606.ex02;

public class Bbb {
	static void method(B b) {}
	public static void main(String[] args) {

		B b = new B();
//		B c = (B) new Aaa();
		B d = new D();
		B e = new E();
	
		b.run();
//		c.run();
		d.run();
		e.run();
		
	}

}
