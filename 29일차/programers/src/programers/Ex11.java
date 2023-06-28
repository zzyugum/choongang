package programers;

public class Ex11 {
	public static void main(String[] args) {

		int number = 10;
		int limit = 3;
		int answer = 0;
		int power = 2;
		int a = 0;
		int sum = 0;
		for (int i = 1; i <= number; i++) {
			a = 0;
			for (int j = 1; j*j<=i; j++) {
				if (number%j  == 0) {
					a += 2;
				} else if (j*j == i) {
					a--;
					System.out.println("1");
				}

			}
			if (a <= limit) {
				sum += a;
			} else {
				sum += power;
			}

		
		}
		System.out.println(sum);
	}
}
