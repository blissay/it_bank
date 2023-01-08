package oper_;

public class UnaryExample {

	public static void main(String[] args) {

		int a = 1;
		//문장의 가장 앞에서 실행
		int b = ++a; //헹위를 하기전에 숫자가 올라간다.
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		
		int c = 1 ; //반복문일때 자주 사용한다.
		//문장의 가장 뒤에서 실행
		int d = c++; //문장 끝에서 처리해준다. c는 1이랑 같지만 끝나면 2가 된다. 행위를 한후에 숫자가 올라간다.
		System.out.println("c : "+c);
		System.out.println("d : "+d);
	}

}
