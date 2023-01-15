package static_;

import java.util.Arrays;

public class MethodExample {

	public static void main(String[] args) {
		// static이 메서드에 붙는것
		// 1. 호출이 굉장히 잦을때 
		System system = new System(); // static 아니면 이렇게 객체를 만들어주고 사용해야한다. static은 그냥 사용한다.
		System.out.println(); //이걸 사용할때 static이 아니면 객체를 하나 생성해주고 사용할수있는데 매번 그러면 속도를 느리게 하는 주범이 된다.
	
		// 2. 매개변수로만 동작하거나 멤버 변수(인스턴스 변수)를 사용하지 않는 경우
		Math math = new Math; // 이게 필요없다.
		Math.random();
		
		
		Random randon = new Random(10); // 매개변수별 난수호출
		Random randon = new Random(100);
		Random randon = new Random(1000);
		
		int ran = (int)(Math.random()*9);  
		
		System.in();
		
		int[] array = new int[3];
		System.out.println(Arrays.toString(array)); // 매개 변수로 이용되기에 객체 안만들어도됨
		
		
		public static String toString(int[] array) {
			String result = "[";
			for (int i=0; i< array.length; i++) {
				if ( i < array.length-1) {
					result += array[i]+",";
					
				}else {
					result += array[i]
				}
			}
		}
		
	}

}
