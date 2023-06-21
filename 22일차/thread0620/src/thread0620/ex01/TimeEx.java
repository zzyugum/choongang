package thread0620.ex01;

public class TimeEx {

	public static void main(String[] args) {
		//시계 스레드
		while(true) {
		Thread ex = new Time();
		ex.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
	}

}
