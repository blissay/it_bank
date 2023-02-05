package treeset_;

import java.util.*;

public class TreeSetExample {

	public static void main(String[] args) {
		// 셋의 경우 내부적으로 순서는 정해져 있지 않아서 인덱스를 통해서 찾을 순 없습니다. 저장된순서는 제맘대로
		TreeSet<String> ts = new TreeSet<String>();
		
		ts.add("hello");
		ts.add("java");
		ts.add("aaa");
		ts.add("computer");
		
		for(String str : ts) {
			System.out.println(str + "\t");
		}

	}

}
