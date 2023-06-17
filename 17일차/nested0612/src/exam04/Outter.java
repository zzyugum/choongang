package exam04;

public class Outter {

	public void method2() {
	int localVariable = 1;
	//localVariable = 100;
	
	class iInner {
		void method() {
			int result = localVariable + 100;
			
		}
	}
	}
	
}
