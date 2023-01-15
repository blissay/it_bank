package homework_;

public class DiamondExample {

	public static void main(String[] args) {
		// 피라미드 부분
		for(int i=0; i<5; i++) {  // 전체 반복회수 즉 별이 찍히는 단수를 반복한다.
			for(int j=0; j<4-i; j++) {  // 첫번째 j는 공백의 숫자. 찍히는 개수를 반복
				System.out.print(" ");
			}
			//다음에 나오는 별모양 갯수. 1,3,5,7,9로 늘어남으로 2의 배수 첫번재가 1개는 있어야 하니까 +1, 
			for(int j=0; j<i*2+1 ; j++) { // 1 3 5 7 9로 갈려면
				System.out.print("*");
			}
					
			
			
			System.out.println(); // 한단쌓고 줄바꿈의 의미
		}
	
	
		
	//역피라미드 로 4단을 만들자
	for(int i=0; i<4; i++) { // 쌓여지는 단수가 4단이므로 4개. 0부터 3까지 세어야 4단이므로 4보다 작으면 3까지 세어진다
		for(int j=0; j < i+1 ; j++) { // 역으로 내려갈려면
			System.out.print(" ");
		}
		
		for(int j=0; j<7-(i*2) ; j++) { // 1 3 5 7 로 갈려면
			System.out.print("*");
		}
				
		
		
		System.out.println();
	}
	
	
	
	}
	

}
