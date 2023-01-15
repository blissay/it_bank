package inheritance_good;

public class Person {

	//서로다른  클래스에서 공통 중복을 따로 빼서 클래스를 만든다. 여러 클래스 안에 있는 중복을 피하는 방법이다.
	//상속시켜주고싶은 코드를 적어놨다.
	public String name; //멤버 변수, 인스턴스 변수라고도 한다 객체별로 이 멤버가 가지고 있다.
	public int age;
	
	public String getDetails() {
		return "이름 : "+this.name+", 나이 : "+this.age;
		
	}
	
	public static void setName(String name) { // static붙으면 this가 올수 없다.
		this.name = name; // static에서 non-static애들은 쓸수 없다.
	}
	
	
	
	public Person(String name, int age) {
		this.name = name; // this는 나자신이다. 정확히 말하면 person으로 만들어진 객체를 말한다. 내 만들어진 객체 내 인스턴스이 변수를 말한다.
		this.age = age;
	}
	
	public Person() {
		
	}
}
