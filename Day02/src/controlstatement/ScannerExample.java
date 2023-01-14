package controlstatement;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //Scanner 클래스를 가져온다. import 해서 해당 패키지를 가져온다. scan은 임의로 만든 변수명
		//System.in 의 경우는 키보드로 입력값을 가지는 메소드
		System.out.print("입력 :"); //콘솔창에 입력으로 준비한다.
		scan.next();
	
		String input = scan.nextLine(); //키보드에서 입력값을 받아서 input변수에 값을 넣어준다
		System.out.println("입력값 : "+input); //input 값을 출력해준다
		scan.close(); 
		
	/*
	 * Scanner scan1 = new Scanner(System.in); 
	 * System.out.print("입력 :"); String
	 * input = scan1.nextLine(); 
	 * System.out.println("입력값 : "+input); 
	 * scan1.close();
	 */
		
		
		
		
	}

}
