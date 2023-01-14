package loop_;

public class ForExample {

	public static void main(String[] args) {
		// for (초기값; 조건식; 증감식) {}
		// 순서 : 1.초기값 -> 2.조건식 -> 3.내용 -> 4.증감식 -> 5.조건식 -> 내용 -> 증감식 ...
		// 반복문 조건문 중첩해서 쓰면 어렵다.
		int sum = 0;
		for(int i=0; i<10; i++) {  //i*=2 2를 계속 곱하기 도 증감식에 가능하다
			sum += i+1;
		}
		System.out.println(sum);
	}

}
