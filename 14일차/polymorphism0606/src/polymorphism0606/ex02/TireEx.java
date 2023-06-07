package polymorphism0606.ex02;

public class TireEx {

	public static void main(String[] args) {

		Tire tire1 = new SnowTire();
		SnowTire tire2 = new SnowTire();
		
		tire1.run();
		tire2.run();
		
		

	}

}
