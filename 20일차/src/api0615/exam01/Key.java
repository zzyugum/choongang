package api0615.exam01;

import java.util.Objects;

public class Key {

	public int number;
	
	public Key(int number) {
		this.number = number;
	}

	@Override
	public boolean equals(Object obj) {

		if(obj instanceof Key) {
			Key ck = (Key) obj;
			if(this.number == ck.number) {
				return true;
			}
		}
		
		return false;
	}
	
	
	
	@Override
	public int hashCode() {
		return number;
	}




	}
	
	
	
