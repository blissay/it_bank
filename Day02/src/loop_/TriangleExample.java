package loop_;

import java.util.Iterator;

public class TriangleExample {

	public static void main(String[] args) {
		// 삼각형 만들기
		// 1줄에 한번, 2줄에 두번. 3줄에 세번 
//		for(int i=0; i<5; i++) {
//			for(int j=0; j<i+1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
			
//		for(int i=0; i<5; i++) {   // 피라미드 별 
//			for(int j=5; j>i+1; j--) {
//				System.out.print(" ");
//			}
//				
//			for(int k=1; k<=i*2+1; k++) {
//				System.out.print("*");			
			
//			}
		
//		for(int i=0; i<5; i++) {  // 피라미드 역 별
//			for(int j=0; j<i+1; j++) {
//				System.out.print(" ");
//			}
//					
//			for(int k=0; k<=9-i*2; k++) {
//				System.out.print("*");			
//				
//			}	
		for(int i=0; i<5; i++) {
			for(int j=0; j<4-i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<i*2+1 ; j++) {
				System.out.print("*");
			}
					
			
			
			System.out.println();
		}
		
		
		
	}
	

}
