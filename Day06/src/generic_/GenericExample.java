package generic_;

public class GenericExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person<String> p1 = new Person<>("엄영범",20);
		Person<Integer> p2 = new Person<>(10,10);
	//	Person p3 = new Person();
		int a = Person.test(10); // 메서드가 호출되는 순간에 정해진다
		String b = Person.test("a");
		Person<String> p = Person.test(new Person<String>("엄영범",20));
		

	}

}
