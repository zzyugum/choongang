package car.ex04;

public class Car2 {


		String a;
		String b;
		String c;
		
		Car2(){}
		

	@Override
		public String toString() {
			return "Car2 [a=" + a + ", b=" + b + ", c=" + c + "]";
		}


	public Car2(String a, String b, String c) {
			super();
			this.a = a;
			this.b = b;
			this.c = c;
		}
	
	void method() {
		System.out.println(this.toString());
	}


	public static void main(String[] args) {

		Car2 car = new Car2 ("홍", "010", "서대문");
		Car2 car1 = new Car2 ("010","홍", "서대문");
		new Car2().a = "홍길동";
		new Car2().method();
		
		System.out.println(car);
		car.method();//to String

	}

}
