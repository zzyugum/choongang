package polymorphism0606;

public class DriverEx {

	public static void main(String[] args) {
		Driver driver = new Driver();
		Vehicle vehicle = new Vehicle();
		Pony pony = new Pony();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		Vehicle driver2 = new Pony();
		driver2.run();
		
		driver.driver(taxi);
		driver.driver(bus);
		driver.driver(vehicle);
		driver.driver(pony);
	}

}
