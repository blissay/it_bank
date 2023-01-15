package poly_;

public class PrintInExample {

	public static void main(String[] args) {
		// 프린트 작성해보겠다. 상속을 이미 쓰고있다.
		// toString  오브젝트를 문자로 변환하고 싶다. 출력 주고 힛다.
		Apple a1 = new Apple(); // 아까 만든 apple 클래스를 가져온다.
		System.out.println(a1);  //주소값이 나온다. 이건 자바가 만들어진 코드를 지금껏 쓰고 있다. 확장성이 쉽게 가능하다.
		myPrintln(a1);  //주소값이 나온다.
		 
		String a = new String("abc");  // 값이 나온다.
		System.out.println(a);
		
		
	}
	
	
	public static void myPrintln(Object obj) { // 프린트ln으로 모든 타입을 받을수 있게 해보자 , Object는 모든 타입을 받을 수있다.
		//object 기본 클래스. 객체를 나타내는 그자체다. 그 객체가 행동을 하는 기능들
		System.out.println(obj.toString()); // 어떤것이든 표현하고 픈 로직을 재정의하면 그걸 사용하게 했다.
		
	}

}
