package thread0620.ex01;

public class TaskEx {

	public static void main(String[] args) {
		Runnable task = new Task();
		Thread th = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("task2");
			}
			
			
		});
		th.start(); // 스레드 실행 요청
		
		
		
		
	}

}
