package poly_;

public class PrintInExample2 {

	public static void main(String[] args) {
		
		
		Fruit a1 = new Apple(); // 데이터형을 하나로 일원화 한다.
		System.out.println(a1);  
		myPrintln(a1);  
		 
		String a = new String("abc");  
		System.out.println(a);
		
		
	}
	
	
	public static void myPrintln(Fruit f) { // ==== 데이터형을 하나로 일원화 한다.
		
		System.out.println(f.getName()); // 사용하는 곳에서는, 객체가 무엇으로 생성되었는지 상관없다 (대단히 중요..., 개발은, 좋은 코드는 모듈간 상관성을 최소화하는 것임)
		
	}

}
