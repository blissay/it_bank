package controlstatement;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		System.out.print("점수 : ");
		int jumsu = scan.nextInt(); // int 속성이라 수식에서 소수점이 나오도 재거 된다.
		//switch(수식) 수식이라는 이야기는 값이 나온다. 분기문이 많을때는 수위치문이 속도가 빠르다.      참고 if(조건식)
		switch(jumsu/10) {
		case 9 :
			System.out.printf("점수 : %d. A학점입니다.",jumsu);
			break;
		case 8 :
			System.out.printf("점수 : %d. B학점입니다.",jumsu);	
			break;
		case 7 :
			System.out.printf("점수 : %d. C학점입니다.",jumsu);
			break;
		default :
			System.out.printf("점수 : %d. 재수강 대상 입니다.",jumsu);
		}
		scan.close();
	}
}
