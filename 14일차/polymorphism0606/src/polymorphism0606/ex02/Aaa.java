package polymorphism0606.ex02;

public class Aaa {
private void run() {
System.out.println("Aaa");
}
}

class B extends Aaa{
	void run() {
		System.out.println("B");
		}
		
}

class D extends B{
	
	void run() {
		System.out.println("D");
		}
		}

class E extends B{
	
	void run() {
	System.out.println("E");
	}
	}

class C extends Aaa{
	
	 void run() {
		System.out.println("C");
		}
		
}

class F extends C{
	
	 void run() {
		System.out.println("F");
		}
		}



