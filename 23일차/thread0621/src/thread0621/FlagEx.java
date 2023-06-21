package thread0621;

public class FlagEx {

	public static void main(String[] args) {

		boolean stop = false; // 플래그(flag)
		int i = 0;
		while (!stop) {
			System.out.println("진행 중");
			i++;
			if (i > 10) {
				stop = !stop;
			}
		}

		System.out.println("완료");
	}
}
