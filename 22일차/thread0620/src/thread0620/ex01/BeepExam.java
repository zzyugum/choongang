package thread0620.ex01;

public class BeepExam {

	public static void main(String[] args) {

		
		Thread thread = new BeepThread();
		
			
		
		thread.start();	
			for(int i =0; i<5; i++) {
				
				System.out.println("띵");
				try{Thread.sleep(500);} catch(Exception e) {}
			}
			
		}
		
	}


