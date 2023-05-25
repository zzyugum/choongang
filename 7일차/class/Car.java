package class0525;

public class Car {

	
		String company = "현대자동차";
		String model;
		String color;
		int maxSpeed;
		
		//클래스를 가져다가 사용하는 사람이 변수값을 정하기 위하여 생성자를 씀
		//가져다가 쓰는 사람이 사용을 안하고 고정된 값이 필요할땐 필드에서 값을 정해서 초기화를 시켜줌;
		
		Car(){
			
		}
		Car(String model){
			this(model, "회색", 250);
			
		}
		Car(String model, String color){
			this(model, color, 250);
			
		}
		
		Car(String model,String color, int maxSpeed){
			this.model = model;
			this.color =color;
			this.maxSpeed = maxSpeed;
		}
}
