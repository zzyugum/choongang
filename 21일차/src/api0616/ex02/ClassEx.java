package api0616.ex02;

class Car{
	int x;
	
}

public class ClassEx {

	public static void main(String[] args) throws ClassNotFoundException {

		Class clazz = Car.class;
		Class clazz2 = Class.forName("api0616.ex02.Car");
		System.out.println(clazz2.getName());
		System.out.println(clazz.getPackageName());
		Car car = new Car();
		System.out.println(car.getClass());
		
	}

}
