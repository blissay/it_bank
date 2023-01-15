package poly_;

public class Person {
	//다형성 예제. 사람이 먹고 싶은 과일
	//사람이 애플을 먹는다
	//과일이 너무 종류가 많으므로 다 일일이 추가할 수 없다. 
	// fruit라는 클래스를 만들어 상속하자
//	void eat(Apple apple) {
//		System.out.println("사람이 "+apple.getName()+"를 먹습니다.";
//	}
//	
//	void eat(Orange orange) {
//		System.out.println("사람이 "+apple.getName()+"를 먹습니다.";
//	}
//	
	
	void eat(Fruit fruit) {
		System.out.println("사람이 "+fruit.getName()+"를/을 먹습니다.");
	}

	
	public static void main(String[] args) {
		Person p = new Person();
		Apple apple = new Apple();
		Orange orange = new Orange();
		p.eat(apple); //사과를 먹습니다.
		p.eat(orange); //오랜지를 먹습니다.
		
		p.eat(new fruit());
	}
}
