package sec01.exam01;

public class Jcclass {
	// field
	int x;
	int y;
	String a;
	
	// constructor
	Jcclass(int x, int y) {
		this.x = x;
		this.y = y;
	}
	Jcclass(int x, int y, String a) {
		this.x = x;
		this.y = y;
		this.a = a;
	}
	
	// method
	int sum(int x, int y) {	
		System.out.println("덧셈 완료"); 
		return x + y; 
	}
	double divide(double x, double y) { 
		System.out.println("나눗셈 완료"); 
		return x / y; 
	}
	void printa(String a) {
		System.out.println("출력값: "+a);
	}
	
}
