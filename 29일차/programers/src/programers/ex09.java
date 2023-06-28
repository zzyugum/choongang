package programers;

public class ex09 {

	public static void main(String[] args) {
		String control = "wsdawsdassw";
		control = control.concat("f");
		System.out.println(control);
		char a;
		int n = 0;
		for (int i = 0; i < control.length(); i++) {
			a = control.charAt(i);
			if (a == 'w') {
				n += 1;
			} else if (a == 's') {
				n -= 1;
			} else if (a == 'd') {
				n += 10;
			} else if (a == 'a') {
				n -= 10;
			}
			
		}
		// int n = 0;
////		for (int i = 0; i < control.length(); i++) {
//			if (control.toCharArray()[i].eqauls("w")) {
//				n += 1;
//			} else if (control.equals("s")) {
//				n -= 1;
//			} else if (control.equals("d")) {
//				n += 10;
//			} else if (control.equals("a")) {
//				n -= 10;
//			}
//		}
//		int answer = n;
//System.out.println(control.indexOf(0, 1));
//	}
	}
}
