package supercode;

import java.util.Random;

public class ArrayEx02 {

	public static void main(String[] args) {
		
		//Array 배열에 1~100사이의 랜덤한 숫자를 저장하고,
		//가장 큰 인덱스 값의 인덱스와 그 위치를 출력하시오
		int array[] = new int[5];
		int maxvalue = 0;
		int maxindex = 0;
		int i;
		Random ran = new Random();
		for(i = 0; i < 5; i++) {
			array[i] = ran.nextInt(100)+1;	
			System.out.println(array[i]);
			if(array[i]>maxvalue) {
				maxvalue = array[i];
				maxindex = i;
			}
		}
		System.out.println("값: "+ maxvalue);
		System.out.println("위치: "+ maxindex);
		

	}

}
