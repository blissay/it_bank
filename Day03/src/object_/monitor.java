package object_;

public class monitor {
	
	int resolution;
	int size;
	int brightness;
	boolean status; //상태 on/off 이런내용으 불린으로 만들어라
	
	monitor(){ // 모든 생성되는 모니터의 기본값을 이렇게 해달라
		this.resolution = 100;
		this.size = 100;
		this.brightness = 100;
	}
	
    void pressButton(){
		this.status = !this.status; //false는 true가되고 true는 false가 되게한다
		
	}

}
