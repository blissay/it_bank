package object_;


public class PenExample {

	public static void main(String[] args) {
		// 펜을 통해 객체 설명
		// 객체생성코드 - 타입(클래스명) 이름 = new 생성자; 
//		Scanner scan = new Scanner(); 이미 만들어져있는것을 내가 만들수는 없다. 이건 java에서 공급하는 메서드임
		Pen redPen = new Pen();  // 클래스를 만들면 그것이 데이타 타입이된다. 이미 만들어진 Pen이라는 class가 있으며 그게 객체이다.
		redPen.color = "빨강"; // 속성을 넣는다.
		redPen.price = 1000;
		redPen.write("안녕하세요"); //Pen의 클래스가 가진 메소드 사용

	}

}
