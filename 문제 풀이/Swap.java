package supercode;

public class Swap {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int tmp = a;
//		swapData(a, b); call by value이어서 안됨
		a = b;
		b = tmp;
		System.out.printf("A = %d, B = %d\n", a, b);
	}
//	public static void swapData(int x, int y) {
//		int tmp = x;
//		x = y;
//		y = tmp;
	}


