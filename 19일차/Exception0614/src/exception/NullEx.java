package exception;

class Aa {
	
	int x;

	@Override
	public String toString() {
		return "Aa [x=" + x + "]";
	} 
}

public class NullEx {

	public static void main(String[] args) {

		Aa a1 = new Aa();
		String data = null;
		if (data != null) {
		System.out.println(data.toString());
		} else {
			System.out.println("값이 null 입니다.");
		}
	}

}
