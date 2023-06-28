package programers;

interface Abc {
	void method();
}
class Ddd implements Abc{

	@Override
	public void method() {
		// TODO Auto-generated method stub
		
	}
	
}
public class Ex5 {

	public static void main(String[] args) {

		Abc vv = new Abc() {
			public void method() {}
			
		};
	}

}
