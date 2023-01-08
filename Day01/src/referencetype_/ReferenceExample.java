package referencetype_;

import java.util.Arrays;

public class ReferenceExample {

	public static void main(String[] args) {
// 바꾸는건 array1을 했고 풀력은 array2를 하므로 참조를 잘 표현하는 예제이다.
		int[] array1 = {1,2,3,4,5,6,7};
		int[] array2 = array1;
		System.out.println(Arrays.toString(array2));
		array1[1] = 8;
		array1[5] = 9;
		System.out.println(Arrays.toString(array2));
		System.out.println(Arrays.toString(array1));
	
	}

}
