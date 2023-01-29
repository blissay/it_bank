package map_;

import java.util.*;

public class Marathon {

	public static void main(String[] args) {
		// 마라톤예제
		String[] participant = {"mislav", "stanko", "anna", "mislav"};
		String[] completion = {"mislav", "stanko", "anna"};
		String result = solution(participant, completion);
		System.out.println("결과 : "+ result);
		
	
	}
	
	public static String solution(String[] participant, String[] completion) {
		Map<String, Integer> map = new HashMap<>();
		
		for(String part : participant) {
			map.put(part, map.getOrDefault(part, 0)+1);//있을때 자기자신. 없을때 0이므로 모든값에 1을 더하면 된다
		}
		
		System.out.println(map);
		
		for(String com : participant) {
			map.put(com, map.get(com)-1);
		}
		
		System.out.println(map);
		
		for(String key : map.keySet()) {
			if(map.get(key)==1) {
				return key;
			}
		}
		
		
		return null;
	}

}
