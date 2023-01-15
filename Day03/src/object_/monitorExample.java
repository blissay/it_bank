package object_;

import java.util.Scanner;

public class monitorExample {

	public static void main(String[] args) {
		// 모니터 전원을 끄고 키는 기능
		
		monitor monoff = new monitor(100,100,100,false);
		
		if(status==false) {
			status = true;
		} else {
			status = false;
		}
		
		System.out.printf("해상도 : %s, 크기 : %s, 밝기 : %s, 상태 : boolean", resolution, size, brightness, status);

	}

}
