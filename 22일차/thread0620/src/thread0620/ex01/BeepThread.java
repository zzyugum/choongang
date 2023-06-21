package thread0620.ex01;

import java.awt.Toolkit;

public class BeepThread extends Thread{

	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i =0; i<5; i++) {	
			toolkit.beep();
			System.out.println("beep");
			try {Thread.sleep(500);} // 1000 = 1초
			catch(Exception e) {}	
	
		}
	}
}
