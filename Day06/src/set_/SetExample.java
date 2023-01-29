package set_;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		// set계열 연습 예제
		Set<Integer> set = new HashSet<>(); //hash set을 선언한다.
		
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


	}
	
	public static Set<Integer> createLotto(){
		Set<Integer> lotto = new HashSet<>();
		while(lotto.size() < 6) {  //6번까지만 한다
			lotto.add((int)(Math.random()*45+1)); //중복숫자는 안받으니까 중복없이 6개를 채운다.
		}
		return lotto;
	}

}
