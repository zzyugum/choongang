package supercode;

public class bublesort {

	public static void main(String[] args) {

		int a[] = {10, 3, 1, 4, 2};
		int b;

	for(int j = 4;j >0 ; j--)
		for(int i = 0;i<a.length-1;i++){
			if(a[i]>a[i+1]) {
				b= a[i+1];
				a[i+1]=a[i];
				a[i] = b;
			}
		}
	
		for (int i = 0; i<a.length; i++) {
			System.out.print(a[i]);		
}
}
}