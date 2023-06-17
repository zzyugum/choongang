package api0615.exam01;

import java.util.HashMap;

public class KeyEx {

	public static void main(String[] args) {

//		Key key1  = new Key(100);
//		Key key2  = new Key(100);
//
//		System.out.println(key1.hashCode());
//		System.out.println(key2.hashCode());
	
		HashMap<Key, String> hashmap = new HashMap<Key, String>();
		hashmap.put(new Key(1), "홍길동");
		String name = hashmap.get(new Key(1));
		System.out.println(name);
		
	}

}
