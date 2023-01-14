package homework_;

import java.util.Arrays;

public class Lotto {

	public static void main(String[] args) {
		// 로또 번호 만들기
		// 배열을 만들어서 그배열에 숫자를 하나씩 넣어주면서 중복하는지 확인해서 집어 넣는다.
		// 숫자를 여섯개를 다 뽑아 놓고 조건식을 달아도 된다. 그렇지만 느리다 경우수 5팩토리얼이 나온다
		// 배열에 숫자를 넣는다. 다음건 뽑아서 중복확인 중복이면 버린다.
		
		int[] lotto = new int[6]; //여섯개 짜리 배열 만들음 이미 0.0.0.0.0.0.0 들어가 있음
		int index = 0 ; // 이것은 내가 배열에 숫자를 몇개를 넣었는지 확인하는 용도. 초기화
		//  같은 숫자 확인은 무한반복이다. 하지만 숫자는 꼭있으므로 같은 숫자 나올때까지 무한 반복
		
		while(true) { //무한반복 코드 , 중복된 로또 번호를 버려야 하는 로직
			int ran = (int)(Math.random()*45+1); // 1-45 숫자중 하나를 봅아준다, 난수를 뽑음 배열에 넣어진 숫자를 비교해보자
			
			int i=0; //i를 for문 바깥에서 선언하였다. for문이 끝나도 다시 int를 0으로 쓰고 싶어서이다.
			for(i=0; i<index; i++) { //index와 비교해서 아래if문 실행 // i가 index 됬을때 종료가 된다
				if(ran == lotto[i]) { //ran이 lotto[0]과 비교해서 같으면 break
					break;   // 숫자 넣은 갯수만큼 배열에서 그 숫자와 비교한다. 같은 숫자가 나오면 break, 즉 같은 숫자가 아닐때여야지 다음으로 넘어간다
				}   // 인텍스 수만큼 즉 배열에 채워넣은 숫자를 모두 비교해야 로직이 끝난다.
			}
			
			if(i==index) { // 난수뽑기 횟수가 index(배열에 넣은 숫자)랑 같으면 index에 1을 추가해서 난수(ran)를 넣어줌
				lotto[index++] = ran; // lotto[index]에 난수를 넣고 index++ 숫자를 하나 높여줌
				// 위에서 break가 안걸렸기 때문에 여기까지 왔다. 중복이 안된것이므로 배열에 넣어준다. 
			}
			
			if(index >5) { //index숫자가 5보다 작으면 break, 계속 수를 넣어서 index가 6이 되면 5보다 커지므로 종료시킨다
				//6개의 숫자가 들어갔음을 의미
				break; //무한방법을 깨버리게 됨.
			}
			
		}
		System.out.println(Arrays.toString(lotto));
		
		
		

	}

}
