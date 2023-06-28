package programers;

public class Ex2 {

		public static void main(String[] args) {
			  int answer = 0;
			String ineq = "<";
			String eq = "=";
			int m = 50;
			int n = 20;
			if (ineq == ">" && eq == "!") {
				if(n > m) {
					answer = 1;
				} else {
					answer = 0;
				}
			}	
			else if(ineq == "<" && eq =="!"){
				if(n < m) {
					answer = 1;
				} else {
					answer = 0;
				}
			}
			else if(ineq == ">" && eq =="="){
				if(n >= m) {
					answer = 1;
				} else {
					answer = 0;
				}
			}
			else if(ineq == "<" && eq =="="){
				if(n <= m) {
					answer = 1;
				} else {
					answer = 0;
				}
			}
			
			System.out.println(answer);
		}}
