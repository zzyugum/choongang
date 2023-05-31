package Sec05.exam;

public class Car {

	private	int gas;
	private	int speed;
	
	void keyTurnOn() {
		System.out.println("키를 돌립니다");
	}
		boolean isLeftGas() {
			if(gas>0) {
				return true;
			} else {
				return false;
			}
		}
	void run() {
		while(isLeftGas()) {
			System.out.println("달립니다. (gas 잔량: "+ gas + "시속 :" + speed + "km/h)");
			if(speed<= 100) {
				speed +=10;
			}
			gas -= 1;
		}
		System.out.println("멈춥니다 gas 잔량: " + gas);
	}
	
	public int getGas() {
		return gas;
	}
	public int getSpeed() {
		return speed;
	}
	
	public void setGas(int gas) {
		this.gas = gas;
	}

	public void setspeed(int speed) {
		this.speed = speed;
	}
		
	public static void main(String[] args) {
		
		// 차를 만든다
		Car car = new Car();
		// 주유한다(연료가 얼마나)
		car.setGas(20);
		// 차키를 돌린다(시동)
		car.keyTurnOn();
		// 달린다 (주유, 속도 정보)
		car.run();
		// 
		
		
		
	}



	}
	

