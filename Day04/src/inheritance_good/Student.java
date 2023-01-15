package inheritance_good;

public class Student extends Person {

	//생성자는 상속 되지 않는다
	
	public int studentId;
	
	public String getDetails() { // 다형성의 좋은예, 상속받은 메서드를 현제 클래스에 맞게 수정해서 사용할 수 있다.
		return super.getDetails()+", 학번 : "+this.studentId; 
	}
	
	public Student(String name, int age, int studentId) { //부모의 메서드를 자녀에서 재정의 했다.
		super(name, age); //부모것을 클어다가 참조해서 사용할 수 있다. 생성자는 못가져 오지만 가능하다.
		this.studentId = studentId;
	}
}
