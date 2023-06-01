package singleton;

public class SingletonEx {

	public static void main(String[] args) {

		
		Singleton a1 = Singleton.getSingleton();
		
		Singleton a2 = Singleton.getSingleton();
		
		for(int i = 0; i <= 3; i++) {
			System.out.println(a1.index);
			a1.index++;
			
			if(a1.index == 2) {
				a1.index = 0;
				i = 0;
			}
		}
	}

}


