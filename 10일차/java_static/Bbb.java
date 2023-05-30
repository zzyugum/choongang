package practice;

public class Bbb {

	int x = 100;
	
	void println() {
		System.out.println(x);
	}
	
	public static void main(String[] args) {

		Bbb bb = new Bbb();
		System.out.println(bb.x);
		bb.println();
	}

}
