package exception_;

public class RuntimeExample {

	public static void main(String[] args) {
		// 런타임익셉션 예제
		//실행중 나는 에러는 runtime 익셉션, 아래 코드는 우리가 코드를 잘썻다고 자바는 생각한다. 그래서 컴파일까지 실행한다.
		
		
		//indexExceptionExample(); //실행하는 코드
		nullPointExecptionExample();
		}
	
	public static void indexExceptionExample() {
		
		int[] array = new int[3];
		System.out.println(array[4]);
		
		String a = "abc";
		System.out.println(a.charAt(5)); //3글자인데 다섯번째 글자를 가져오라고 하니 익셉션 발생
		
		
	}
	
	public static void arithmeticExceptionExample() {
		
		int a = 3;
		int b = 0;
		int c = a/b; //4칙연산 에러
		
	}
	
	public static void nullPointExecptionExample() {
		String a = null; // null은 아무것도 없다는 뜻이다. 이것 어떤 메서드도 호출할수 없다.
		System.out.println(a.charAt(0)); //가장 중요한 익셉션. 참조의 주체가 될수 없다.
	}

}
