package exception_;

import java.io.IOException;

public class CheckedExample {

	public static void main(String[] args) {
		// 올바로 설계를 했어도 잘못된 값을 입력하면 예외가 나오므로 에외차러 해야한다.
		System.out.println("값을 입력받는 프로그램입니다.");
		byte[] data = new byte[100];
		try {System.in.read(data);
			}catch(IOException e){e.printStackTrace();
				}
		System.out.println("입력한 문자열은 : ");
		System.out.println(new String(data).trim());
		

	}

}
