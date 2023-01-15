package inheritance_good;

public class Person {

	//서로다른  클래스에서 공통 중복을 따로 빼서 클래스를 만든다. 여러 클래스 안에 있는 중복을 피하는 방법이다.
	//상속시켜주고싶은 코드를 적어놨다.
	public String name;
	public int age;
	
	public String getDetails() {
		return "이름 : "+this.name+", 나이 : "+this.age;
		
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person() {
		
	}
}
