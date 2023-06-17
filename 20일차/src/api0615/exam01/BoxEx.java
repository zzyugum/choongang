package api0615.exam01;


class Apple {}


public class BoxEx {

	public static void main(String[] args) {
		
		Box box = new Box();
		box.set("홍길동");
		String name =(String) box.get();
		System.out.println(name);
		box.set(new Apple());
		Apple apple3 = (Apple) box.get();
		System.out.println(apple3);
		
		NewBox<Apple> newBox2 = new NewBox<Apple>();
		newBox2.set(new Apple());
		Apple apple = newBox2.get();
		System.out.println(apple);
		
		NewBox<Integer> a3 = new NewBox<>();
		a3.set(100);
		int res = a3.get();
		System.out.println(res);
	}

}
