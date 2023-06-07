package polymorphism0606;

public class FeedEx {

	public static void main(String[] args) {
		
		Feed feed = new Feed();
		Cat cat = new Cat();
		Dog dog = new Dog();
		feed.feed(cat);
		feed.feed(dog);
		feed.feed(null);
		
	}

}
