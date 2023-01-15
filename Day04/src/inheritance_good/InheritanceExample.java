package inheritance_good;

public class InheritanceExample {

	public static void main(String[] args) {
		// 학생과 선생의 상속이 잘 되었는지 확인해보자
		// 상속을 통해서 코드를 재활용하였다. 이것보다는 다른 목적이 있다.
		// 상속의 진짜 목적은 코드의 확장이다. 다형성
		
		Person p1 = new Person("엄영범", 20);  // 생성자를 만들어서 데이터르 넣는다. 
		Student s1 = new Student("엄영범", 20, 2010); // 이름과 나이를 셋팅하지 않았는데 상속을 해서 사용할 수 있엇다.
		Teacher t1 = new Teacher("엄영범", 20, "Java");
		
//		System.out.println(p1.getDetails()); // 잘 출력이 되었는지 확인하는 코드
//		System.out.println(s1.getDetails());
//		System.out.println(t1.getDetails());
		
		Person p2 = (Person)s1; // 다형적 객체, 자식이 부모 형태로 바뀌는거 // 명시적으로 person으로 선언되었다. 
		//궂이 student를 만들어서 person으로 바꿔서 쓰는이유가 중요하다
		//student이지만 person이 되었다.
		System.out.println(p2.getDetails()); //부모를 썻는데 자녀가 딸려왔다. 부모에 있는 메서드를 자녀에서 재정의했다. 그러면 자녀의 메서드를 실행해 준다.

		Person p3 = (Person)t1;
		System.out.println(p3.getDetails());

	}

}
