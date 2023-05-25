package supercode;

import java.util.Scanner;

public class ArrayEx01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int array[] = {10, 543, 52, 24, 67};
		int index = 0;
		System.out.print("값을 입력하세요:");
		int value = scan.nextInt();

		for(int i = 0; i<array.length; i++ ) {
			if(value == array[i]) {
				index = i;
				System.out.print("위치: ");
				System.out.println(index);
			} 
		}
	
	}

}
