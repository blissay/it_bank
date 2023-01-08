package method_;

public class MethodExample {

	public static void main(String[] args) {
		int result = minus(10,5);
		System.out.println(result);
		System.out.println(minus(10,5));
	}
	
	//리턴타입 이름(매개변수1, 매개변수2..) {}
	//void - 리턴 하지 않아도 됨
	static int minus(int num1, int num2) {
		return num1 - num2;
		
	}
	
}
