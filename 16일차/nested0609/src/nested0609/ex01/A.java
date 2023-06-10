package nested0609.ex01;

public class A {
	
	String method () {
		class D {
			
			D(){
				System.out.println("D()");
			}
			String methodDD() {
				return "D1";
			}
		}
	D d1 = new D();
	return d1.methodDD();
	}
	
	
	
	
	

	static class C {
		int field1;
		static int field2;
		void method() {}
		static void method2() {}
		C(){
			System.out.println("C()");
		}
	}
	
	A(){
		System.out.println("A()");
	}
	
	class B {
		int field1;
//		static int field2; 스태틱이 붙은필드/메소드 사용 불가
		void method() {}
//		static void method2() {}
		B(){
			System.out.println("B()");
		}
	}
	
}
