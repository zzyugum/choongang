package overrideing0602;

public class Childe extends Parent {

	public Childe(int x) {
		//System.out.println(); //오류
		//super(); 오류
		super(x);
		super.total();
	}


	@Override
	void print() {
		// TODO Auto-generated method stub
		super.print();
	}
	


}
