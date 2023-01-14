package homework;

import java.util.Arrays;

public class homework2 {
	public static void main(String[] args) {
		int[] lotto = {0,0,0,0,0,0};
		int index =0;
		
		while(true) {	
			int r = (int)(Math.random()*45+1);
			int i = 0;
			
			for(i = 0; i < index; i++) {
				if (lotto[i] == r) {
					break;
				}
			}
			
			if(i == index) {
				lotto[index++] = r;
			}
			
			if(index > 5)
				break;
		}
		
		System.out.println("로또 번호: " + Arrays.toString(lotto));
	}
}
