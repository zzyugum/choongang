package sec05.exam04;

public class MySingleton {

	
	String name = "123";
	private static MySingleton mysingleton = new MySingleton();
	
	private MySingleton() {
		name = "321";
		System.out.println(name);
	}
		
	
	
	static MySingleton getInstance() {
		return mysingleton;
	}
	
}
