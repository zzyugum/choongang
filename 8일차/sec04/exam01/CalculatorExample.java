package sec04.exam01;

public class CalculatorExample {

	public static void main(String[] args) {

		Calculator myCalc = new Calculator(5,6);
//		클래스 내의 생성자 선언이 있을경우 기본 생성자 호출 안됨
//		Calculator myCalc = new Calculator();   X
		
		myCalc.powerOn();
		
		int result1 = myCalc.plus();
		System.out.println(result1);
		
//		byte x = 10;
//		byte y = 4;
//		
//		myCalc.x = 10;
//		myCalc.y = 3;
		myCalc.setY(10);
		myCalc.setX(5);
		
		double result2 = myCalc.divide();
		System.out.println(result2);
		System.out.println("x: "+myCalc.getX());
		System.out.println("x: "+myCalc.getY());
		
		myCalc.poerOff();

	}

}
