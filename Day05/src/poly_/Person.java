package poly_;

public class Person {

	void eat(Food food) {
		System.out.println("사람이 "+ food.getName()+"를/을 먹습니다.");
	}
// 고기와 과일을 구분하지 않고 food  고기이자 음식, 과일이자 음식 으로 표현할 수 있었다.
	
	
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
