package primitivetype_;

public class StringExample {

	public static void main(String[] args) {
		// ""로 표현 - 공백 및 특수문자 포함 길이제한 없음
		// string과 다른 타입의 + 연산은 결과가 무조건 String
		// 내부적으로 charcharchar의 형태
		String a = "abcd";
		String b = "10";
		System.out.println(a+b);
		System.out.println(b+10);
		String c = "\uBED1\uBD10"; //1010
		System.out.println(c);
		
		String d = "10";
		String e = new String("10");
		System.out.println(e);
		System.out.println(d==e);
		System.out.println(d.equals(e));
	}

}
