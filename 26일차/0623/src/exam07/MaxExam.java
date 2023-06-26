package exam07;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MaxExam {

	
	public static void main(String[] args) {
		
		Map<String,Integer> map = new HashMap<String,Integer>();
		
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);

		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		for(Map.Entry<String, Integer> entry : entrySet) {
			if(entry.getValue()>maxScore) {
				name = entry.getKey();
				maxScore = entry.getValue();
			}
			totalScore += entry.getValue();	
		}
		int avgScore = totalScore / map.size();
		System.out.println(avgScore);
		System.out.println(maxScore);
		System.out.println(name);
	}
}
