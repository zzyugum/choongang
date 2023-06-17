package exception;

public class ArrayEx {

	public static void main(String[] args) {
		if(args.length != 3) {
		System.out.println("매개 값이 부족합니다");
		System.exit(0);  //정상 종료
		}else {
		
		String data1 = args[0];
		String data2 = args[1];

	//	System.out.println(data1);
		System.out.println(args.length);
		}
	}

}
