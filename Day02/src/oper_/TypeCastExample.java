package oper_;

public class TypeCastExample {

	public static void main(String[] args) {
		//(타입) - 형변환(데이터 타입 변경)
		byte a = 1;
		int b = a; //작은것을 큰것에 넣는건 문제가 안된다
		
		int c = 1;
	//	byte d = c;   큰것을 작은것에 넣을수 없다. int변수는 4바이트것이다
		byte d = (byte)c;  // 형변환으로 변수를 바이트로 바꾸어준다
		
		int e = 102389;
		byte f = (byte)e; //형변환시 남는 비트는 그냥 제거 - 값이 변경될 수 있음
		
		System.out.println(f); //에러는 안뜨지만 숫자기 바뀐다. 앞에 것을 짜르고 8비트만 남기고 숫자가 반환된다.
		// 원화는 숫자 102389가 출력되지 않는다. -11이 출력됨. 맨앞의 비트가 음수 양수를 나타냄. 1일경우 음수 출력
	}

}
