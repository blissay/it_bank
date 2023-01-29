package list_;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		// list 프레임 워크 사용 예제
		// arraylist 속도가 빨라서 실제 데이타를 저장한다. 입력 수정 삭제가 불편하다.번거롭다
		//링크드 리스트는 노드가 나눠어 져서 노드끼리 주소로 연결되어있어서 입력 삭제가 쉽지만. 조회가 느리다
	//	List list = new ArrayList(); // 어떤 데이타든지 다 들어갈수 있다. object다 스트링을 넣어도 오브젝트가 나온다. 한가지 타입만 들어간다면 제네릭을 사용 <>
		List<String> list = new ArrayList<>();
		list.add("123");list.add("456");list.add("78");
		list.add("9");
		System.out.println("리스트 : "+list);
		System.out.println("리스트 길이: "+list.size()); // 실제 값이 나온다. 원래 배열은 주소값이 보여지는데 
		System.out.println(list.set(2, "10")); // 바꾸면서 내값을 다시집어 넣어라
		System.out.println("리스트 : "+list);
		System.out.println(list.get(1));
		System.out.println(list.remove(2)); //2는 세번째것을 지우라
		System.out.println(list.remove("10"));//값을 넣어도 그걸 지워준다
		System.out.println(list.contains("9"));// 9를 포함했느냐
		System.out.println("리스트 : "+list);

	}

}
