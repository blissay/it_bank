package oper_;

public class LogicalExample {

	public static void main(String[] args) {
		
		int x=10, y=20;
		if ((x != 10) & (++y == 21)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		System.out.println("x: " + x + ", y: " + y);
		
		if ((x == 10) | (++y == 21)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		System.out.println("x: " + x + ", y: " + y);
		
		
		//&& ||을 잘 활용하자. 속도가 빠르다
		int a=10, b=20;
		if ((a != 10) && (++b== 21)) {
			System.out.println("true");
			
		} else {
			System.out.println("false");
		}
		System.out.println("a: " + a + ", b: " + b);
		
		if ((a != 10) || (++b== 21)) {
			System.out.println("true");
			
		} else {
			System.out.println("false");
		}
		System.out.println("a: " + a + ", b: " + b);
	}//end main

}
