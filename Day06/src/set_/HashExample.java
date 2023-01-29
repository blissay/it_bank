package set_;

import java.util.*;

public class HashExample {

	public static void main(String[] args) {
		// 중복데이타 확인
		Set<Person> pset = new HashSet<>();
		pset.add(new Person("이승민",20));
		pset.add(new Person("이승민",20));
		
		System.out.println(pset.size());
		System.out.println(pset);
		
		Set<String> set = new HashSet<>();
		set.add("123"); set.add("123");
		System.out.println(set.size());
		System.out.println(set);

	}

}
