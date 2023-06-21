package thread0621;

public class InterruptExam {

	public static void main(String[] args) {

		Thread thread = new PrintThread2();
		thread.start();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}

		thread.interrupt();

	}
}
