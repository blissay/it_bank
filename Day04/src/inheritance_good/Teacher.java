package inheritance_good;

public class Teacher extends Person {

	
	// 상속은 
	
	public String subject;
	
	public String getDetails() {
		return super.getDetails()+", 과목 : "+this.subject; //다형성, 상속받아서 메서드를 변형시켜서 사용한다. 원레 getDetails()는 과목이 없었다.
	}
	
	public Teacher(String name, int age, String subject) {
		super(name, age); //부모것을 클어다가 참조해서 사용할 수 있다. 생성자는 못가져 오지만 가능하다.
		this.subject = subject;
	}
	
}
