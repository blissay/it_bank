package rexep_;

import java.util.regex.Pattern;

public class EmailExample {
	
	
	public static void main(String[] args) {
		// 이메일 예제
		//도메인은 영어만 있다고 가정하자
		
		// 실무에 있을때는 matches를 사용하면 안된다.
		// 패턴객체가 만들어진다. 메모리에 저장된다. 메모리 부하가 걸린다. 
		//
		String emailPattern = "^\\[0-9a-zA-Z]{1}\\w*@[a-z]+\\.[a-z]+)";
		
		String email1 = "abc@naver.com";
		String email2 = "abc@navermcon.com";
		String email3 = "def@google.co.kr";
		String email4 = "abc@NAVER.COM";
		
		if(email1.matches(emailPattern)) {
			System.out.println(email1);
		}
        if(email2.matches(emailPattern)) {
			System.out.println(email2);
		}
        if(email3.matches(emailPattern)) {
			System.out.println(email3);
		}
        if(email4.matches(emailPattern)) {
			System.out.println(email4);
		}

	}

}
