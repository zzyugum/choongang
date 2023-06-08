package exam01;

public class RemoteControlEx {

	public static void main(String[] args) {

		
		RemoteControl rc;
		rc = new Television();
		Searchable se = (Searchable) rc;
		se.seaerch("www.naver.com");
		execute(rc, 2);
		
//		rc.turnOn();
//		rc.turnOff();
//		rc.setVolume(-13);
		
		
		rc = new Audio();
		execute(rc);
//		rc.turnOn();
//		rc.turnOff();
//		rc.setVolume(-13);
	}

	private static void execute(RemoteControl rc) {
		
		rc.turnOn();
		rc.turnOff();
		
	}
	private static void execute(RemoteControl rc, int volume) {
		
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(volume);
		
		
	}	

}
