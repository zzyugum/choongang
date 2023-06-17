package api0616.ex02;

public class SystemTimeExam {

	public static void main(String[] args) {

		long time1 = System.nanoTime();
		
		long sum = 0;
		
		for(long i = 1; i<=1000000; i++) {
			sum+=i;
		}

		
		long time2 = System.nanoTime();
		System.out.println("1~1000000 까지의 합 : " + sum);
		System.out.println("계산에 " + (time2-time1) + "나노초가 소요되었습니다.");
		
	}

}
