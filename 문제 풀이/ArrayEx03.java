package supercode;

public class ArrayEx03 {

	public static void main(String[] args) {
		
		int[]arr = {1, 3, 3, 6, 5, 6, 1, 8, 9};
		
		int[] input1 = {6, 1, 8};
		int[] input2 = {6, 3};
		
		for(int i = 0;i<arr.length ;i++) {
			for(int j =0 ; j<input1.length; j++) {
			if(arr[i] == input1[j]) {
				System.out.println("true");
				}else {
					System.out.println("false");
				}
		}
		}
	}

}
	
