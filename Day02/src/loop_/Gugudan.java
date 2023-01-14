package loop_;

public class Gugudan {

	public static void main(String[] args) {
		// for문을 위한 구구단 만들기
		// 간단을 1부터 9까지 곱하는게 반복된다. 단이 2단 부터 9단까지 있다. 반복이 중첩이 되는 구조다. 
		//2단부터 9단가지 반복하고 각각의 단에서 1부터 9까지 곱해주면된다.
//		for(int i=2; i<=9; i++) {  // 한단이 가로로 나열된다.
//			for(int j=1; j<=9; j++) {
//				System.out.printf("%d*%d=%2d\t",i,j,i*j);
//			}
//			System.out.println(); // 한줄띠기의 기능을 가진다
//		}
		// 숫자나열을 한단이 세로로 스게 
//		for(int j=1; j<=9; j++) {
//			for(int i=2; i<=9; i++) {
//				System.out.printf("%d*%d=%2d\t",i,j,i*j);
//			}
//			System.out.println();
//		}
		
		
		
		for(int i=1; i<=9; i++) {  // 한단이 가로로 나열된다.
			for(int j=2; j<=9; j++) {
			System.out.printf("%d*%d=%2d\t",j,i,i*j);			
			}
			System.out.println(); // 한줄띠기의 기능을 가진다
		}
	}

}
