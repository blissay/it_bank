package exception_;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TriCatchExample {

	public static void main(String[] args) {
		// try에서 다양한 에외가 생길수 있다. 
		// catch를 하나 더 박는다. 멀치 캐치
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 입력 : ");
		int num = 0;
		try {
			num = scan.nextInt();  //에러가 될수 있는 부분이 여기다. 잘못된 값이 들어가면 예외 발생
			int ran = (int)Math.random()*2; // 0으로 나누어지는 에러 생긴다.
			System.out.println(num / ran);
		}catch(InputMismatchException e) {  //RuntimeException어떤 에러가 뜰지 모르겟으면 적는다. // 멀티 엑셉션
			System.out.println("숫자만 입력하셔야 합니다.");
			System.out.println("기본값 0 할당.");
			
		}catch(ArithmeticException e){
			throw new DuplicateException("아이디가 중복됩니다.");
			
		}finally {
			scan.close(); //길었을대 문제가 생길수 잇으므로 여기에 넣는다.

		}
		
		System.out.println("입력하신 숫자 : "+num); //지역변수로 num을 사용할려면 앞에서 선언해 줘야한다.
		
	}

}
