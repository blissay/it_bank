package homework_;

public class DiamondExample2 {

	// 다이아몬드에서 중간에 *을 빼고 $모양을 넣는다. $모양은 j 값이 짝수일때 들어간다.
	
	public static void main(String[] args) {
		// 역 피라미드 만들기
		for(int i=0; i<5; i++) { //0부터4까지 다섯번을 실행한다
			for(int j=0; j<4-i; j++) { // 역으로 내려갈려면
				System.out.print(" "); //i가0이면 4번실행, i가1이면 3번실행, i가 2이면 2번실행 공백을
			}
			
			for(int j=0; j<i*2+1 ; j++) { // 1 3 5 7 9로 갈려면
				if(j==0 || j==2*i) {
					System.out.print("*");
				} else {
					if(j==0 || j==2*i) {
						System.out.print(" ");	
					} else {
						System.out.print("$");
					}
				}	
			}
			System.out.println();
		}
	
	
	
		for(int i=0; i<5; i++) {
			for(int j=0; j<i; j++) { // 역으로 내려갈려면
				System.out.print(" ");
			}
		
			for(int j=0; j<9-(i*2) ; j++) { // 1 3 5 7 9로 갈려면
				if(j==0 || j==2*i) {
					System.out.print("$");
				} else {
					System.out.println(" ");
			}

		
		
		System.out.println();
	}
	
	
}
	



