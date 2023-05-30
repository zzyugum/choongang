package car.ex04;

public class Carex01 {

	//1. 가스 용량 확인
	//2. 가스 주입
	//3. 출발
	//4. 남은 가스 용량
	//5. 가스가 부족할시 멈춤
	
	int gas;
	int speed;

	void gasState(int gas) {
		this.gas = gas;	
		
	} //가스 용량 확인및 주입
	
	void start() {
		System.out.println("출발 합니다");
	}
	
	int getSpeed() {
		return speed;
	}
	
	boolean run() {
		
			while(true) {
			if(gas > 0) {
				for(int i = 0; i<=gas; i++) {
					speed += 10;
					if(speed>=150) {
						speed = 150;
					}
					System.out.println("남은 gas: " +gas);
					System.out.println("현재 속도: " + speed);
					gas -= 1;
					
					}
			}else {
				System.out.println("gas가 부족합니다. 남은 gas(" +gas+ ")");
				speed = 0;
				return false;
			}
			}
	}
	
	int isLeftGas() {

		if(gas > 0) {
			System.out.println("남은 gas: " +gas);
			return gas;
		
		} else {
			System.out.println("남은 gas: " +gas);
			return gas;
		}
	}
	
	
	
}
