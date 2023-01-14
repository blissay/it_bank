package referencetype_;

import java.util.Arrays;

public class ArrayExample {

	public static void main(String[] args) {
		//타임[] 배열이름; - 선언
		//타입[] 배열이름 = new 타입[칸수]; - 초기화 / 타입[] 배열이름 = {값1,값2.....}; 초기화2
		int[] array;
		array = new int[3];
		int[] array2 = {1,2,3,4,5}; //선언하는 그줄에서만 초기화가 가능하다
		//참조형은 주소값을 들고 있다. hash
		System.out.println(array);
		//배열 값 조회 - Arrays.toString(배열)
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(array2));
		//이름[번째] 배열의 개별 값을 불러오고 싶으면
		//자바의 인덱스는 0부터 출발
		System.out.println(array2[2]);
		array2[2] = 6;
		System.out.println(array2[2]);
		
	}

}
