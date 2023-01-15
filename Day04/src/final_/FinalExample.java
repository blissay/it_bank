package final_;

public class FinalExample {

	// final에 대한 예제 변수,클래스,메서드에 붙고 이후에는 값이 변경되지 않는다.
	
	// 클레스에 final 상속이 안된다. String은 상속하면 안됨. 클래스이지만 기본형으로 사용할 수 있다. 
	// 이건 내가 작성한 대로만 써야한다. 그럴려면 메서드,클래스에 final을 붙여 주면된다.
	
	int a;
	//final int b; // b가 에러, 변수에 붙으면 final로 끝나 버린다.
//	final int b = 10; // 값을 넣어줘야한다. 이후에는 변경이 안됨으로. 변수에 final이 붙으면 99% static이 붙는다. 객체별로 존재할 이유가 없다.
	static final int b = 10; // 다른데서도 써야 하므로	
		
	public static void main(String[] args) {
		// final에 대한 예제 변수,클래스,메서드에 붙고 이후에는 값이 변경되지 않는다.
		FinalExample f = new FinalExample();
		f.a = 10;
		f.b = 20; // final 이 붙어있으므로 변경할 수 없다.
		
		FinalExample f1 = new FinalExample();
		
		Math.PI;  // 상수. 원주율
		double d = Math.E;
	}
}
