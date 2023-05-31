package sec05.exam04;

public class Aaa {
	
	private static Aaa a1 = new Aaa();
	private Aaa() {
	}
	
	static Aaa AaaEx() {
		
		return a1;

	}

}
