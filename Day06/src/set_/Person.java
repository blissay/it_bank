package set_;

public class Person implements Comparable<Person>{ // 크기비교를 위해서 인터페이스를 활용하자
	
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		// set계열 예제
		return "Person [name="  + name + ". age=" + age + "]";
	}

	
	// 같은 데이타 값을 같다고 만들어주는 재정의 코드 source/ generate hash로 재정의 할수잇다.
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) // this는 나다, 나랑 오브젝트로 들어온게 같으니? 주소값이 까지 같으냐ㅑ
			return true; // 조소갑이 같으면 끝
		if (obj == null) // 들어온게 없으면 나가자
			return false;
		if (getClass() != obj.getClass()) // 내클래스랑 들어온클래스랑 같냐?
			return false;
		Person other = (Person) obj; //같은 클래스이면 펄슨으로 바꾼다.
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true; // 이름도 나이도 같으면 결국은 같다.
	}

	@Override
	public int compareTo(Person o) {
		// 비교할것을 가져오자
		return this.name.compareTo(o.name);
	}
	
	
	

}
