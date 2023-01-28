package exception_;

import java.util.Scanner;

public class TriCatchExample {

	public static void main(String[] args) {
		// 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 입력 : ");
		int num = scan.nextInt();  //에러가 될수 있는 부분이 여기다. 잘못된 값이 들어가면 예외 발생
		System.out.println("입력하신 숫자 : "+num);
		scan.close();

	}

}
