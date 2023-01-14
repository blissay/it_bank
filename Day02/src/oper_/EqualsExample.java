package oper_;

public class EqualsExample {

	public static void main(String[] args) {
		int a = 1;
		int b = 1;
		System.out.printf("%d와 %d는 같은가? %s\n",a,b,a==b); //%d 정수를 출력, %f 실수를 출력 , %c 문자를 출력, %s 문자열을 출력
		// \n은 문자열안에 넣을수 있고 다음 커서를 한칸 내려준다
		String c = "a";
		String d = "a";
		
		System.out.println(c==d);
		
		String e = new String("a"); //new로 지정을 했으므로 숫자1의 값을 갖지만 hash값이 틀려진다.
		
		System.out.println(c==e);
		System.out.println(c.equals(e));
	}

}
