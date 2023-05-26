package sec04.exam01;

public class Computer {

	int sum1(int[] values) {
		int sum = 0;
		for(int i = 0; i<values.length; i++) {
			sum+=values[i];			 
		}
		return sum;
	
	}
//				...의 매개변수 타입은 배열임
	int sum2(int ... values){
	 int sum = 0;
		for(int i = 0; i<values.length; i++) {
			sum+=values[i];			 
		}
		return sum;
	 
	}
}
	


