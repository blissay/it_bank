package loop_;

public class WhileExample {

	public static void main(String[] args) {
		// while(조건식) {} - 조건식이 true인 경우 계속 실행
		// 무한루프에 많이 쓰인다. 무한루프 또는 횟수가 많은 반복문
		int i = 0;
		int sum = 0;
		while (i < 10) {
			sum += i++ +1;
		}
		System.out.println(sum);
		
		
//		int i = 0;
//		int b = 0;
//		while (i < 10) {
//			i = ++i;
//			b = b + i
//				
//		}
//		System.out.println(b);
		
		
		
	}

}
