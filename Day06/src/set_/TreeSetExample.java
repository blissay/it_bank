package set_;

import java.util.*;

public class TreeSetExample {

	public static void main(String[] args) {
		// 콜랙션에서 트리구조에 대한 예제
		// 구조상. 크기비교해서 오름차순으로 자동 정열된다.
		
		Set<Integer> set = new TreeSet<>();
		
		set.add(10);set.add(1);set.add(5); // 다섯개 숫자만 넣어보자
		set.add(6);set.add(4); 
		
		System.out.println(set); //[1,4,5,6,10]으로

		Set<String> strSet = new TreeSet<>(); // 문자열은 순서가 있는지 궁금/
		strSet.add("12");strSet.add("가나");strSet.add("나다");
		strSet.add("ab");strSet.add("다");
		
		System.out.println(strSet); //[12, ab, 가나, 나다, 다] 이렇게 나옴. 아스키 코드 순서로 정열된다.첫글자로 크기 비교를 한다.

		Set<Person> pset = new TreeSet<>();
		pset.add(new Person("임영범",20));pset.add(new Person("박영준",20));
		
		System.out.println(pset); // classcastexception. 자료형이 못바꾸서 그렇다. person이 comparable로 못바꾼다. 연결이 안되어 있다.
		// person클래스로 가서 인터페이스를 만들고 구현을 해서 크기 비교를 하자 implements Comparable<Person> 이렇게 comparable롤 implements 하면된다
		//[Person [name=박영준. age=20], Person [name=임영범. age=20]]
		
//		public static Set<Integer> createLotto2(){
//			Set<Integer> lotto2 = new TreeSet<>();
//			while(lotto2.size() < 6) {  //6번까지만 한다
//				lotto2.add((int)(Math.random()*45+1)); //중복숫자는 안받으니까 중복없이 6개를 채운다.
//			}
//			return lotto2;
//		}
	}

}
