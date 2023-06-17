package exam01;

public class A {
		static int test;
	void method() {
		class D {
			D(){
				System.out.println("D 생성자");
			}
			
		};
		D d = new D();	
	}
	
	A(){
		
		System.out.println("A 생성자");
	}
	class B{
		int field1;
		//static int field2;
		//static void method() {}
		B(){
			System.out.println("B 생성자");
		}
	}		 //인스턴스 멤버 클래스
	static class C{

		int field1;
		static int field2;
		static void method() {}
		C(){
			System.out.println("C 생성자");
		}
	} // 정적 멤버 클래스 
}
