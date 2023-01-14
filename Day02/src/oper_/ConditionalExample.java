package oper_;

public class ConditionalExample {

	public static void main(String[] args) {
		// Math.random() = 0.000.. ~ 0.999..까지의 난수 생성
		//조건식 ? 참일때 값 : 거짓일때 값
		int ran = (int)(Math.random()*8+1); // 0-7까지 나온다. +1을 하면 8까지 1-8나옴
		String message = ran%2==0 ? "찍수" : "홀수";//%2 2로나눌대 나머지가 0일때 참, 1일때 거짓
		System.out.printf("숫자 : %d. 이 숫자는 %s 입니다.",ran,message);
	}

}
