package straem0628;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx1 {
	static int sum = 0;;
	public static void main(String[] args) {

		IntStream st1 = IntStream.rangeClosed(1, 10);
		st1.forEach(w->{
			sum += w;
			System.out.println(sum);
		});
		
//		
//		
//		int[] intArray = {1,2,3,4,5};
//		IntStream intStream = Arrays.stream(intArray);
//		intStream.forEach(a->System.out.println(a));
//		
//		String[] strArray= { "홍", "김", "박"};
//		Stream<String> stream =Arrays.stream(strArray);
//		stream.forEach(s->{
//			System.out.println(s);
//		});
//		
//		for(int i=0; i<strArray.length; i++) {
//			System.out.println(strArray[i]);
//			
//		}
//		for(String str : strArray) {
//			System.out.println(str);
//		}
//		
	}

}
