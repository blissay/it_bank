package object_;

public class Pen {

	// 클래스는 설계도이면서 새로만들어지 type data가 된다.
	// 객체 설명 
	// pen이다 펜, 속성이 가격있다 펜이가지고 있는 명사적 값을 속성이라 하자
	// 클래스의 3요소 - 멤버(기타 코드 작성 불가)
	// 속성(변수), 기능(메서드), 생성자(객체 생성)
	// 클레스를 만드는 이유는 속성, 기능을 하고 싶어서임. 생성자를 안적으며 강제로 생성자를 만들어 놓는다.
	// 메서드와 생성자는 비슷하지만 메서드는 리턴을 할수도 있고 안할수도 있지만 셩성자의 리턴 값은 객체가 된다
		
	int price;
	String color; // 명사적 표현이 변수
	
	void write(String message) { //메소드를 만들어서 펜이가지는 동사적인 개념 기능  Pen클래스가 가지는 메소드(동사)
		System.out.println("색깔 : "+color+", 메세지 : "+message);
	}

	// 생성자를 구현하지 않는 겨웅 컴파일러가 기본생성자 생성 - 어떤 경우에도 객체 생성이 가능하게
	// 생성자는 여러게 구현가능, 한 개라도 구현하면 기본생성은 하지 않는다.
	// 보여지지 않아도 생성자는 만들어져 있음
	// 클래스의 이름과 동일, 리터 타임 X - 메서드 지만 결과가 정해져 있기 때문에(객체 생성)
	
//	Pen() { // 이런것이 생성자이다. 리턴값은 안적는다. 이건 기본생성자라고 한다.
		
//	}
	
	// 
	
	Pen(String color, int price){ //자바는 지역변수언어이므로 외부에 있는 변수를 생성자 안으로 못가져오므로 내거 this. 를 사용한다
		this.color = color;
	    this.price = price;
	    
	    //객체를 다른사람이 손못대게 만들수 있다. 여기서 생성자를 만들면 다른데서 손을 못대게 된다.
	}

	
    System.out.println(); // 클래서 안에서는 3요소가 아니므로 에러가 된다.
    for (i=0; i<10; i++) {
    	
    }
	
} // 여기에 에러가 뜨는이유는 for문이 클래스에 들어와서임. for문도 3요소가 아니므로 에러가 된다.
