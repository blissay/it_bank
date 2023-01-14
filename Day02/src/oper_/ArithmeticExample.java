package oper_;

public class ArithmeticExample {

	public static void main(String[] args) {
		byte a = 1;
		byte b = 1;
	//	byte c = a+b; 안들어가 짐. int형으로 결과가 바뀐다. 그래서 결과가 byte에 들어가지 않는다.
		byte c = (byte)(a+b); // 바이트로 형변환 하면 들어갈 수 있다
		
	//	int d = 3;
	//	int e = 2;
	//	int f = d/e;
	//	double f = d/e; //이렇게 해도 1.0 숫자가 짤리낟. 안그럴려면. d e 중 하나는 double형이 되야한다.
		
		int d = 3;
		double e = 2;
		double f = d/e; // 1.5값이 출력된다.
		
		System.out.println(f);
	}

}
