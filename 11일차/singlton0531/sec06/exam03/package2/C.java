package sec06.exam03.package2;

import sec06.exam03.package1.A;

public class C {
	
//	A a1 = new A(true); //가능
//	A a2 = new A(1);  불가능
//	A a3 = new A("3"); 불가능
		public C() {
			A a = new A();
			
			a.field1 = 1;
//			a.field2 = 1;
//			a.field3 = 1;
			
			a.method1();
//			a.method2();
//			a.method3();
		
		}

}
