package poly_;

public class Person {

	void eat(Food food) {
		System.out.println("사람이 "+ food.getName()+"를/을 먹습니다.");
	}

	
	
	public static void main(String[] args) {
		Person p = new Person();
		Apple apple = new Apple();
		Orange orange = new Orange();
		p.eat(apple); //사과를 먹습니다.
		p.eat(orange); //오랜지를 먹습니다.
		p.eat(new Pork());
		p.eat(new Beef());
		
		
		
	//	p.eat(new fruit());
	}
}
