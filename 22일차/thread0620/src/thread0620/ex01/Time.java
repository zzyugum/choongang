package thread0620.ex01;

import java.time.LocalDate;
import java.time.LocalTime;

public class Time extends Thread{

	@Override
	public void run() {

		
		String LDT = LocalDate.now() + " "+
		LocalTime.now().toString().substring(0, 8);
		System.out.println(LDT);
		
	}
	
	

	
	
}
