package polymorphism0606;

class Tire{}

class ATire extends Tire{}

public class Car {

	Tire t1;  //= new Tire();

	Car(){
		//Tire t2= new Tire();
		ATire t2 = new ATire();
		method(t2);
	}
	
	void method(Tire tire){
		//t1 = new ATire(); // 필드의 다형성
		t1 = tire;
	}
}
