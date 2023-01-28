package list_;

import java.util.*;


public class CollectionsExample {

	public static void main(String[] args) {
		// 정열하는 메서드 예제
		
		List<Integer> list = new ArrayList<>();
		for(int i=1; i<=45; i++) {
			list.add(i);
		}
		
		System.out.println(list);
		
		
		Collections.shuffle(list);
		
		System.out.println(list);
		
		
		Collections.sort(list);
		
		System.out.println(list);
		
		
		Collections.sort(list, Collections.reverseOrder());
		
		System.out.println(list);
	}

}
