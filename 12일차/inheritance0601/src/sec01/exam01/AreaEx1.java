package sec01.exam01;

import java.util.Scanner;

public class AreaEx1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Area area = new Area();
		
		area.setX(Integer.parseInt(scan.nextLine()));
		area.setY(Integer.parseInt(scan.nextLine()));
		
		System.out.println(area.AreaEx("넓이"));
//		int a;
//		int b;
//		Scanner scan = new Scanner(System.in);
//		a = Integer.parseInt(scan.nextLine());
//		b = Integer.parseInt(scan.nextLine());
//		
//		area = new Area();
//		area.printArea();
		
		

	}

}
