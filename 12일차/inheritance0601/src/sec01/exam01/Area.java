package sec01.exam01;

public class Area{ // 순수한 클래스 설계

	private int x;
	private int y;
	
		public int getX() {
		return x;
	}
		
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
		public Area() {
	}
		Area(int x, int y){
			
			this.x = x;
			this.y = y;
	}
		int AreaEx() {
				
				
				return x*y;
			}
		String AreaEx(String a) {
		
			return a + ":"+ x*y;
			
		}
//		void printArea() {
//			System.out.println("직사각형의 넓이: ");
//			System.out.println(AreaEx());
//		}
	
		
}
