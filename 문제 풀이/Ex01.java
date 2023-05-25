package supercode;

public class Ex01 {

	public static void main(String[] args) {
		

		int count = 0;
		
		boolean run = true;
		
		while(run) {

			if(count == 3) {
				run = false;
			} else {
				System.out.println(7*(count+1));
				count++;
				
			}
		}
		
	}

}
