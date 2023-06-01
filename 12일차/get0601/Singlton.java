package singleton;

public class Singleton {

	private static Singleton singleton = new Singleton();
	
	int index;
	
	private Singleton() {
		
	}

	public static Singleton getSingleton() {
		return singleton;
	}
	
	
	
	}
	

