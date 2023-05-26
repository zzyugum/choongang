package sec04.exam01;

public class Calculator {
	
	private int x;
	private int y;
	//객체를 생성하고 초기값 설정을위해 생성자를 만듬
		Calculator(int x, int y){
			this.x = x;
			this.y = y;
		}
//		private 지정자 일때 x값을 변경을 위해서 씀
		void setX(int x) {
			this.x = x;
			
		}
		void setY(int y) {
			this.y = y;
		}
		void powerOn() {
			System.out.println("전원을 켭니다.");
			
		}
		
		int plus() {
			return x + y; 
		}
		double divide() {
			return (double)x / (double)y;
		}
//		private 접근지정자일때 x값을 불러올때 쓰는 메소드
		int getX() {
			return x;	
		}
		void xPrint() {
			System.out.println(x);
		}
		int getY() {
			return y;	
		}
		
		
		void poerOff() {
			System.out.println("전원을 끕니다");
		}

}
