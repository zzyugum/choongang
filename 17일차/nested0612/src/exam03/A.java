package exam03;

public class A {

	int field1;
	void method() {}
	
	static class C {
		void method() {
			A a = new A();
			a.field1 = 10;
		}
	}
}
