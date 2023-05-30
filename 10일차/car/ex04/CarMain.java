package car.ex04;

import java.util.Scanner;

public class CarMain {

	public static void main(String[] args) {
		
		int gas = 0;
		Scanner scanner = new Scanner(System.in);
		Carex01 myCar = new Carex01();
		boolean run = true;
			while(run) {
				if(myCar.isLeftGas()> 0 ) {
					System.out.println("연료가 있습니다.");
					myCar.run();
				}else {
					System.out.println("연료가 없습니다.");
					System.out.println("연료를 주입 하시겠습니까?");
					System.out.println("1. 주입한다 2. 멈춘다");
					int select = Integer.parseInt(scanner.nextLine());
					switch(select) {
					case 1:System.out.println("가스를 주입합니다");
							
							myCar.gasState(Integer.parseInt(scanner.nextLine()));
							break;
					case 2:
						System.out.println("작동을 멈춥니다.");
						run = false;
					}
				} 
		

		}

}
}
	

