package p127.pro001;

import java.util.Scanner;

public class Problem {

	public static void main(String[] args) {
		
//		byte b = 5;
//		b = -b;  //p127 확인 문제 1번

//		
//	int x = 10;
//	int y = 20;
//	int z = (++x) + (y--);  // x:11 y:20
//	System.out.println(z);

//	boolean stop = true;
//	while (stop != true) {
//		System.out.println("1");
//	}
//

//		int p = 534;
//		int s = 30;
//		
//		int ps = (p/s);
//		System.out.println(ps);
//		int pl = (p%s);
//		System.out.println(pl);
			
//		int var1 = 5;
//		int var2 = 2;
//		double var3 = var1 / (double) var2;
//		int var4 = (int)(var3*var2);
//		System.out.println(var4);
		
//		int value = 356;
//		System.out.println(value-value%100);
		
//		for(double x = 0.1; x<1.0;x+=0.1) {
//			System.out.println(x);
//		}
//		float var1 = 10f;
//		double var2 = var1/100.0;
//		if(var2 == 0.1) {
//			System.out.println("10%입니다");
//		} else {
//			System.out.println("10%가 아닙니다.");
//		}
		
//		int lengthTop = 5;
//		int lengthBottom = 10;
//		int height = 7;
//		double area = ((lengthTop+lengthBottom)*height/2.0);
//		System.out.println(area);
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("첫 번째 수: ");
//		String a = scanner.next();
//		System.out.print("두 번째 수: ");
//		String b = scanner.next();
//		
//		double c = Double.parseDouble(a);
//		double d = Double.parseDouble(b);
//		
//		if(d != 0) {
//			System.out.println(c/d);
//		}
//		else {
//			System.out.println("무한대");
//		}
//		
//		int var1 = 10;
//		int var2 = 3;
//		int var3 = 14;
//			double var4 = var1 * var1 * Double.parseDouble(var2 + "." + var3);
//		System.out.println(var4);

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("아이디: ");
		String name = scanner.nextLine();
		
		System.out.print("비밀번호: ");
		String pass = scanner.nextLine();
		int intpass = Integer.parseInt(pass);
		if(name.equals("java")) {
			if(intpass == 12345) {
				System.out.println("로그인 성공");
			}else {
				System.out.println("로그인 실패 : 패스워드가 틀림");
			}
		}else {
			System.out.println("로그인 실패: 아이디가 존재하지 않음");
		}
	}

}
