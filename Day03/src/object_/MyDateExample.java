package object_;

public class MyDateExample {

	public static void main(String[] args) {
		//날짜를 출력할 수 있는 간단한 프로그램 , 직접 접근은 못하게
		MyDate today = new MyDate();
		today.year = 2023;
		today.setYear(0);
		today.month = 1;
		today.day = 14;
		today.getDate();

	}

}
