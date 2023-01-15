package inheritance_bad;

public class Student {
	
	//변수를 public으로 만들어진 나쁜예이다. 다른 클래스에서 수정도 가능하게 된다.
	//  Teacher라는 클래스에서 name과 age가 중복되서 사용된다. 나쁜에이다.
	
	public String name; // public으로 만들어진 변수
	public int age;
	public int studentId;
	
	public String getDetails() { //getDetails()라는 메서드 정의한다.
		return "이름 : "+this.name+", 나이 : "+this.age+", 학번 : "+this.studentId;
		
	}
	
	public Student(String name, int age, int studentId) { //student라는 메서를 정의한다.
		this.name = name; // 전역변수를 메서드에서 사용할 수 있게 내거라는 확인을 한다. this.
		this.age = age;
		this.studentId = studentId;
	}

}
