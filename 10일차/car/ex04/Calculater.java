package car.ex04;

public class Calculater {
		
	int plus(int x, int y) {
		int result = x + y ;  //3.avg에서 받은 7, 10값을 더한다음 값을 avg에 반환
		System.out.println(result);
		
		return result;
	}
	
	double avg(int x , int y) {
		double sum = plus(x, y); // 2.execute 에서 받은 7,10 값을 넣어서 plus 호출
		double result = sum / 2; // 4.plus 에서 반환받은 result 값을 계산해서 exctue에 result값 반환
		return result;
	
	}
	
		void execute() {
			double result = avg(7, 10); // 1. 메인에서 호출하면 avg메소드에 7, 10값을 넣어서 호출
			println("실행결과: " + result); // 5.avg받은 result 값을 프린트 println에 넣어서 호출
		}								//7.println에서 되돌아온후 메인으로 되돌아감
		
		void println(String message) {
			System.out.println(message); //6.excute에서 받은 값을 message에 넣어서 프린트 후 excute로 되돌아감
		}
	
	
}
