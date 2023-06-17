package exception02;

class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}
class Lion{}
public class ClassCastEx {

	public static void changeDog(Animal animal) {
		if (animal instanceof Dog) {
		Dog dog = (Dog) animal;
		}else {
			System.out.println("안됩니다");
		}
		}
	public static void main(String[] args) {

		Dog dog = new Dog();
		Cat cat = new Cat();
		Lion lion = new Lion();
		changeDog(cat);
		
	}

}
