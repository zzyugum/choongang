package programers;

public class Ex4 {
//	public static void printArr(int[] arr) {
//		for(int a : arr) {
//			System.out.print(a);
//
//		}
//		System.out.println();
//	
//	}
	public static void main(String[] args) {
		int[] arr = {5,23,1,43,100,	200, 40};
		for(int i = 0; i<arr.length; i++) {
			for(int j= i+1; j<arr.length; j++) {
				if(arr[i]> arr[j]) {
					
					int temp = 0;
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
//				printArr(arr);
			}
			
		}
		for(int a : arr) {
			System.out.println(a);
		}
	
	}
	
}
