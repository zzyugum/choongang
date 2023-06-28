package programers;

public class Ex10 {

	public static void main(String[] args) {
		int[] numLog = {0, 1, 0, 10, 0, 1, 0, 10, 0, -10, -2, 1};
		 String answer = "";
	        int sum = 0;
	        for(int i = 0; i<numLog.length;i++){
	           if(sum - numLog[i]== -1){
	               answer = answer.concat("w");
	               sum += 1;
	           } else if (sum -numLog[i] == 1){
	               answer = answer.concat("s");
	               sum -= 1;           
	           } else if ( sum - numLog[i] == -10){
	               answer = answer.concat("d");
	            sum += 10;
	           } else if ( sum - numLog[i] == 10){
	               answer = answer.concat("a");
	          sum -= 10;
	           }
	        }
	        System.out.println(answer);

	}

}
