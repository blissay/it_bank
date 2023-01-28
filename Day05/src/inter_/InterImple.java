package inter_;

public class InterImple implements Inter1,Inter2{

	// 이 인터페이스의 모든것을 여기서 구현해야한다 
	// 구현할때는 여러개의 인터페이스는 ,를 이용해서 추가 하면된다
	// 각각의 인터1,2에서 a()는 여기서 함께 구현이 된다.
	
	@Override
	public void a() {
		// 오버라이드 source에서 불러들임
		System.out.println("a 구현");
		
	}
	
	
	
	
	
	

}
