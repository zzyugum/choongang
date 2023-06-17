package Test;

public class AniEx {

	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.sound();
		
		Driver driver = new Driver();
		driver.drive(d1);
		//익명의 객체 생성으로 고양이 소리가 나오게 하세요.
		Animal cat = new Animal() {

			@Override
			public void sound() {

				System.out.println("야옹");
				
			}
			
		};
		cat.sound();
		// 다른 고양이
		driver.drive(new Animal() {

			@Override
			public void sound() {
				System.out.println("야오옹");
				
			}
			
		});
	}
	
}
