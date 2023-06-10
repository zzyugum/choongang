package interface0609.ex03;

public class Example {

	public static void main(String[] args) {

		ImplementationC impl = new ImplementationC();
		InterfaceA a1 = impl;
		InterfaceB b1 = impl;
		InterfaceC c1 = impl;
		a1.methodA();
		b1.methodB();
		c1.methodA();
		c1.methodB();
		c1.methodC();
		
		

	}

}
