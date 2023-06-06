package CarExample;

public class Tire {

	public int maxRotation;  //최대 회전수(수명)
	public int accumulatedRotation; // 누적 회전수
	public String location;  // 타이어 위치
	
	public Tire(String location, int maxRotation) {
		
		this.location = location;
		this.maxRotation = maxRotation;
		
	}
	
	public boolean roll() {
		
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + "tire 수명:" + (maxRotation-accumulatedRotation)+ "회");
		return true;
		} else {
			
			System.out.println("****" + location + "타이어 펑크****");
			return false;
		}
	}
	
}
