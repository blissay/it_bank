package abstract_;

public abstract class Shape { // 내부에 추상메서드가 하나라도 있으면 abstract가 붙어서 추상클래스가 된다. 구현이 안된다.

	// 도형에 대한 개념을 가지고 코드를 짜보자. abstract에 대한 공부 
	// 삼각형은 존재하지만 도형은 실체가 없는 개념이다. 
	// 도형한테 물려줄 개념을 잡자
	
	public int x; // 좌표를 물려주자
	public int y;
	
	public abstract double getArea();  // 면적을 구한다는 기능을 물려주고 싶다. 공식을 넘겨주는게 아니라 메서들 전달한다. 원. 사각형 면적 구하는게 틀리다.
		  // 메서드에 abstract를 붙여주면 구형부가 없어 집니다.
		// 무조건 재정의 해서 써야한다. 상속해서 재정의해서 써야한다.
	// 추상 메서드가 하나라도 있는 클래스는 구현이 안되있다. 추상클래스다.
	
	public static void main(String[] args) {
//		Shape shape = new Shape(); //추상클래스는 사용할 수 없다.
//		Shape.getArea();
		
	}
}
