package set_;

import java.util.*;

public class HashExample {

	public static void main(String[] args) {
		// 중복데이타 확인
		// hash라는 것은 컴퓨터상에서 어떤 데이터를 빠르게 찾기 위해서 그 데이터에 짧은 영어나 숫자로 이름을 붙여 놧다.
		// 자바에서는 모든 클래스가 해쉬를 생성할 수 있게 한다.
		// 모든 자바에서 해쉬를 쓸수있게 할려면 Object에다가 해쉬를 만들어서 넣어주면된다. 
		// object에서 이퀄스는 같은지는 주소값을 확인한다. 
		Set<Person> pset = new HashSet<>();//해쉬로 짧은 이름을 붙여 놨다. 찾을때 를 위해서. 모든 데이타 구조에서 해쉬를 사용한다. 편리하다. 자바에서
		pset.add(new Person("이승민",20));
		pset.add(new Person("이승민",20));//같게 만들어주면 뭘하면되는가? 오브젝트에서 물려받은 이퀄을 여기서 재정의 하면된다. 내용이 같으면 같다고 한다.
		// generate  hash, equal 가 있다.
		
		// 재정의를 통해서 데이타 값이 같으므로 같은 값으로 주소가 틀리더라도 같다고 인식됨
		
		System.out.println(pset.size());
		System.out.println(pset);
		
		Set<String> set = new HashSet<>();
		set.add("123"); set.add("123");
		System.out.println(set.size());
		System.out.println(set);

	}

}
