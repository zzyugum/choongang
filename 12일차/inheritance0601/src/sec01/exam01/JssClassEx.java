package sec01.exam01;

public class JssClassEx extends Jcclass {

	JssClassEx(int x, int y,String a) {
		super(x, y, a);
		
	}
	
	void printScore() {
			super.printa(a);	
			System.out.println(x);
			System.out.println(y);
			System.out.println(super.divide(x, y));
			System.out.println(super.sum(x, y));
			
}
}
