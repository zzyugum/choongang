package interface0609.ex01;

public class SoundalbeEx {

	private static void PrintSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}

	public static void main(String[] args) {
		PrintSound(new Cat());
		PrintSound(new Dog());
		
	}
}
