package set_;

import java.util.*;

public class MapExample {

	public static void main(String[] args) {
		// map계열 예제
		// add로 데이타를 넣는게 아니라 put으로 데이타를 넣어준다. 키와 밸류 두가지를 넣어준다.
		// 순서는 없다. 고유값으로 다 돌아간다. 밸류는 상관없고 키값만을 중복체크한다.
		Map<String, Integer> map = new HashMap<>(); // 제한이 없다. 맵안에 맵맵을 넣을 수가 있다.
		map.put("엄영범", 20);map.put("박용준", 30);map.put("김승희", 10);
		
		System.out.println(map); //{김승희=10, 박용준=30, 엄영범=20} 맵의 저장형태가 이렇다.
		
		map.put("엄영범", 50);
		System.out.println(map); //{김승희=10, 박용준=30, 엄영범=50} 중복은 안되고 뒷값으로 바꾸어준다.
		System.out.println(map.get("엄영범")); // 해당키에 대한 값을 빼낼수 있다.
		
		// 맵을 셋으로 바꿔서 사용하자
		//엔트리 셋
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		
		for(Map.Entry<String, Integer> entry : entrySet) {
			
		}
		
		Iterator<Map.Entry<String, Integer>> iter = entrySet.iterator();
	
		
		//트리셋으로 변형헤서 for문을 사용할 수 있다.
		Set<String> keySet = map.keySet();
		for(String key : keySet) {
			System.out.println(map.get(key)); //10 30 50으로 출력된다.
			
		}
		
		
	}

}
