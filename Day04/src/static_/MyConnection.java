package static_;

public class MyConnection {
	// 서버가 터지지 않게 제한자 만 가지고 제한을 줄 수있다.
	// 객체 제한을 할려면 생성자를 막아야 한다.
	// 네이버의 운영방식과 동일
	
	private static MyConnection c = new MyConnection(); // c 리턴을 하기 위해 만들어줌. c라는 생성자를 만들어줌.
	
	private MyConnection() { // 생성자를 막음. 이건 내 클래스에서 밖에 못쓴다. 사용을 못하게 했으므로 막아두고 사용할 수 있는 방법을 메서드로 뚫여주자.
		
	}
	
	public static MyConnection getConnection() { // public메서드를 만드는데 꼭 static이 붙어야함. 
			//	return new MyConnection():  // 이렇게 되면 제한이 없어서 안됨
		return c; //private static MyConnection c = new MyConnection();이걸 만들고 c를 리턴한다
	}
	
	
	

}
