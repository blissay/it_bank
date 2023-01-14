package homework_;

public class DiamondExample {

	public static void main(String[] args) {
		// 역 피라미드 만들기
		for(int i=0; i<5; i++) {
			for(int j=0; j<4-i; j++) { // 역으로 내려갈려면
				System.out.print(" ");
			}
			
			for(int j=0; j<i*2+1 ; j++) { // 1 3 5 7 9로 갈려면
				System.out.print("*");
			}
					
			
			
			System.out.println();
		}
	
	
	
	for(int i=0; i<5; i++) {
		for(int j=0; j<i; j++) { // 역으로 내려갈려면
			System.out.print(" ");
		}
		
		for(int j=0; j<9-(i*2) ; j++) { // 1 3 5 7 9로 갈려면
			System.out.print("*");
		}
				
		
		
		System.out.println();
	}
	
	
	
	}
	

}
