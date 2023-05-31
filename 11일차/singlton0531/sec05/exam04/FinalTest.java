package sec05.exam04;

public class FinalTest {
	static final int z =23;
	final int X;
	final String ssn;
	
	
	public FinalTest(int x, String ssn) {
		super();
		X = x;
		this.ssn = ssn;
	}

	
	public static void main(String[] args) {
		FinalTest ft = new FinalTest(10, "홍");
		System.out.println(ft.ssn);
		FinalTest ft2 = new FinalTest(20, "김");
		System.out.println(ft2.z);
		
		
		final int y =800 ;
	
	}
	
}
