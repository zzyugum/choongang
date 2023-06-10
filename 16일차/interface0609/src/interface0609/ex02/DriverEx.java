package interface0609.ex02;

public class DriverEx {

	public static void main(String[] args) {
		
		Vehicle vehicle1 = new Vehicle() {

			@Override
			public void run() {

				System.out.println("새로운 차 달린다.");
				
			}
			
		};
			
		vehicle1.run();
		Vehicle vehicle = new Bus();  //필드 다형성
		vehicle.run();
		Bus bus = (Bus) vehicle;
		bus.checkFare();
		
		if(vehicle instanceof Bus) {
			
			System.out.println(vehicle instanceof Driver);
			((Bus) vehicle).checkFare();
		}
	}

}
