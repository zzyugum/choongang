package supercode;

import java.util.Scanner;

public class ArrayEx04 {

	public static void main(String[] args) {

		int data[] = {5,2,6,8,5,6};
		int arr = 0;
		Scanner scanner = new Scanner(System.in);
//		while(true) {
//			
//			arr = Integer.parseInt(scanner.nextLine());
//			data = new int[arr];
//			
//		}
		for(int i = 0; i<data.length;i++ ) {
			System.out.print("입력: ");
			data[data.length] = Integer.parseInt(scanner.nextLine());
			for(int j = 0; j<data.length; j++)
				if (data[i] == data[j]) {
					data[j] = data[j+1];
				}
			for(int x = 0; x<data.length;x++) {
			System.out.print(data[x]);
			}
			}

		
	
		
	}

}
