package set_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		// set계열 연습 예제
		Set<Integer> set = new HashSet<>(); //hash set을 선언한다. Integer 클래스다 앞글자 대문자이므로. 기본형 타입이 못들어 갈때 기본형변수를 참조형 변수로 바꿈
		//레퍼변수다. 
		set.add(10);set.add(5);set.add(4); // 데이타를 집어 넣는다. 순서는 컴퓨터 맘대로
		set.add(7);set.add(21);set.add(55);
		
		System.out.println(set.size()); // 데이타 저장된 크기를 
		System.out.println(set); // 셋을 출력
		System.out.println(set.contains(55)); 
		
		set.remove(10);  //값중 10을 지워주자
		System.out.println(set);
		
		set.add(4); //셋에서 중복된 4를 넣어보자
		System.out.println(set);
		System.out.println(set.add(4));// 4를 넣어보자 
		
		System.out.println(createLotto());
	
		// 들어온 데이타를 꺼낼거다
		for(int a : set) {  // int 기본형타입 // set에서 하나하나씩 빼온다
			System.out.println(a);
		}
		
		Iterator<Integer> iter = set.iterator(); //이터레이터에서 콜렉선에서 하나하나까서 쓰기위해서 만든 메서드
		//has 다음값이 있느냐  hashNext 다음 값을 가져와라 셋은 순서가 없다.
		while(iter.hasNext()) {
			System.out.println(iter.hasNext());
		}


	}
	
	public static Set<Integer> createLotto(){
		Set<Integer> lotto = new HashSet<>();
		while(lotto.size() < 6) {  //6번까지만 한다
			lotto.add((int)(Math.random()*45+1)); //중복숫자는 안받으니까 중복없이 6개를 채운다.
		}
		return lotto;
	}

}
