package primitivetype_;

public class CharExample {

	public static void main(String[] args) {
	    //''안에 표현 - 한 글자만 가능
		char a = 'A';
		char b = '\t';
		char c = '\uC010';
		//문장속에 변수값을 넣을때 유용한 메서드
		//(문장,값1,값2....)형태로 사용
		//표현식 - char : %c, 정수 : %d, 소수 : %f, string : %s
		System.out.printf("a : %c, b : %c, c : %c",a,b,c);
		System.out.println("\n a : "+a+",  b : "+b+", c : "+c);
		
		
	}

}
