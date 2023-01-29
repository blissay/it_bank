package set_;

public class Person {
	
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
	
	

}
