package controlstatement;

import java.util.Scanner;

public class IfExample {

	public static void main(String[] args) {
		//if(조건식) {} else{} - 조건식이 true면 if문, false면 else문 안의 내용 실행 (else 생략 가능)
		//if() {} else if (조건식) {} - 여려개의 조건식 적용가능 (else 생력 가능)
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		System.out.print("점수 : ");
		int jumsu = scan.nextInt();
		if (jumsu >= 90) {
			System.out.printf("점수 : %d. A학점 입니다.",jumsu);
		} else if (jumsu >= 80){
			System.out.printf("점수 : %d. B학점 입니다.",jumsu);
		} else if (jumsu >= 70){
			System.out.printf("점수 : %d. C학점 입니다.",jumsu);
		} else {
			System.out.printf("점수 : %d. 재수강 대상 입니다.",jumsu);
		}
		scan.close();
	}

}
