package homework_;

public class DiamondExample2 {

	// 다이아몬드에서 중간에 공백으로 만든다
	
	public static void main(String[] args) {
		//피라미드만들기
		for(int i=0; i<5; i++) { //0부터4까지 다섯번을 실행한다
			for(int j=0; j<4-i; j++) { // 역으로 내려갈려면 공백을 역으로 내려가면서 4,3,2,1
				System.out.print(" "); //i가0이면 4번실행, i가1이면 3번실행, i가 2이면 2번실행 공백을
			}
			
			for(int j=0; j<i*2+1 ; j++) { // 1 3 5 7 9로 갈려면 이렇게 하는데. *과 $를 엊갈려서 출력해야함.
				if(j==0 || j==2*i) { // 첫번째 별나오고 2의 배수마다 출현해야하므로 또는 으로 두개를 함
					System.out.print("*");
				} else {
					if(j%2 == 1) { //2의배수일
						System.out.print(" ");	
					} else {
						System.out.print("$");
					}
				}	
			}
			System.out.println();
		}
	
	
	
		for(int i=0; i<4; i++) {
			for(int j=0; j<i; j++) { // 역으로 내려갈려면
				System.out.print(" ");
			}
		
			for(int j=0; j<7-(i*2) ; j++) { // 1 3 5 7 9로 갈려면
				if(j==0 || j==2*i) {
					System.out.print("$");
				} else {
					System.out.println(" ");
				}
			}
			System.out.println();
		}
	}
	
}
	



