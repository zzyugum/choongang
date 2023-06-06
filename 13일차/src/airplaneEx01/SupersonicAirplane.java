package airplaneEx01;

public class SupersonicAirplane extends AirplaneEx01{
	
	public Airplane mode = null;

	@Override
	public void fly() {
		if(mode == Airplane.SUPERSONIC) {
			
			System.out.println("초음속비행합니다");
		}else {	
			super.fly();
			}
	}
	
	
	
	

}
