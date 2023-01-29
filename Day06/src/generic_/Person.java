package generic_;

public class Person<E> {
	// 제너릭 설명 예제
	// 이름에 꼭 제네릭을 선언해 줘야한다. <E>
	

	public E name;
	public int age;
	
	
	// 셋,겟으로 구멍을 뚫어줌
	public E getName() {
		return name;
	}
	public void setName(E name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	//
	@Override
	public String toString() {
		// toString을 구현한다. 새롭게 정의한다.
		return "Person [name= " + name + ", age= " + age + "]";
			
	}
	
	public Person(E name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public static <T> T test(T t) {
		return t;
	}
	
	
	
	
	

}
