package promotion;

	class A{}

	
	class B extends A{}
	
	class C extends A{}
	
	class D extends B{}
	class E extends C{}
	

	
		public class  Exam01{
			
			public static void maion(String[] args) {
				
				B b = new B();
				C c = new C();
				D d = new D();
				E e = new E();
				
				A a1 = b;
				A a2 = c;
				A a3 = d;
				A a4 = e;
				
				B b1 = d;
				C c1 = e;
				
//				B b3 = e;
//				C c2 = d;
			}
			
			
		}

