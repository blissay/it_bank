package exception_;

public class RuntimeExceptionExample {
	
	public static int makeException1(int input) {
		int divide = 0;
		int result = input/divide;
		return result;
	}
	
	public static void makeException2() {
		String s = "가";
		System.out.println(s.charAt(1));
				
	}
	
	public static void makeException3() throws Exception{
		int[] a = {1,2,3};
		System.out.println(a[3]);
	}
	
	public static void makeException4() {
		String nothing = null;
		System.out.println(nothing.split(""));
	}
	
	public static void makeException5() {
		String notInt = "가나다";
		int a = Integer.parseInt(notInt);
	}
	
	public static void makeException6() {
		for(int i=0; i<Integer.MAX_VALUE; i++) {
			makeException6();
		}
	}
	
	public static void makeException7() {
		Object[] objArr = new String[3];
		objArr[0] = 0;
	}
	
	public static void makeException8() {
		Object[] objArr = new String[3];
		objArr[0] = "0";
	}
	
	public static void main(String[] args) throws Exception{
		// Runtime Exception도 마지막엔 결국 try catch 해주어야 프로그램이 멈추지 않습니다.
		makeException1(4);
		makeException2();
		makeException3();
		makeException4();
		makeException5();
		makeException6();
		makeException7();
		makeException8();
	}

}
