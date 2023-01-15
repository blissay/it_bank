package static_;

public class CountExample {

	public static void main(String[] args) { // 메인은 클래스단위로 존재한다. static이있다. 메인은 전체를 실행하는 것이므로 객체를 만들어서 실행하면 논리상 안맞으므로 
		//메인에 static이 붙어셔 객체를 만들지 않고도 실행한다.
		// c1을 만들어서 a와 b를 올리고 출력한다.
		//a는 다시 처음으로 되돌아 가지만
		//b는 static으로 선언되서 계속 고정된단. 계속 update되서 그값이 남는다.
		//b는 count에 있는 b이다.
		
		Count c1 = new Count();
		c1.a++;
		c1.b++; // b는 static변수로서 사용해라, 옆에 있는 노란색도 문제가 있다는 표시임.
		
		System.out.println("c1.a : "+c1.a+", c1.b : "+c1.b);
		
		Count c2 = new Count();
		c2.a++;
		c2.b++;

		System.out.println("c2.a : "+c2.a+", c2.b : "+c2.b);
		
		Count.b++; // b를 static변수답게 호출하는 방법. 노란색 표시가 없어짐. 클래스 단위로 호출한다.
	}

}
