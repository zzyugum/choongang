package airplaneEx01;

public class SupersonicEx01 {

	public static void main(String[] args) {

		
		
		SupersonicAirplane sa = new SupersonicAirplane();
		
		sa.takeOff();
		sa.fly();
		sa.mode = Airplane.SUPERSONIC;
		sa.fly();
		sa.mode = Airplane.NORMAL;
		sa.fly();
		sa.land();

	}

}
