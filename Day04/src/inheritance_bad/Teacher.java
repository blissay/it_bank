package inheritance_bad;

public class Teacher {

	// 작성하다보니 Student에서 변수중 name, age가 중복되서 사용하고 있다.
	// 다른 클래스에서 코드를 복사할수 있다. 변수를 동시에 바꿀수 있다. find, replace기능을 사용하자 Ctrl-F
	
	public String name;
	public int age;
	public int subject;
	
	public String getDetails() {
		return "이름 : "+this.name+", 나이 : "+this.age+", 과목 : "+this.subject;
		
	}
	
	public Teacher(String name, int age, int subject) {
		this.name = name;
		this.age = age;
		this.subject = subject;
	}

}
