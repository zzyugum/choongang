package exam07;

import java.util.Stack;

public class StackExapm {

	public static void main(String[] args) {
		
		Stack<Coin> coinBox=new Stack<Coin>();
		
		
		coinBox.push(new Coin(150));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));

		Coin coin1 = coinBox.peek();
		System.out.println(coin1.getValue());
		
		while(!coinBox.isEmpty()) {
			Coin coin = coinBox.pop();
			System.out.println(coin.getValue());
		}
		
	}

}
