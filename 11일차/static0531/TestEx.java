package Sec05.exam;

public class TestEx {

	int x;
	void printX() {
		System.out.println(x);
	}
	
	static int y = 200;
	
	public static void printY() {

		System.out.println(y);
	}
	public static void main(String[] args) {

		printY();
		
		
		TestEx test = new TestEx();
		
		test.x = 100;
		test.printX();

	}

}
