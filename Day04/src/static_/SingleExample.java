package static_;

public class SingleExample {

	public static void main(String[] args) {
		// 싱글턴 디자인 페턴이다
		// 네이버 프로그램서버에서 데이타 베이스 라인에 제한을 줘야 한다.
		
	//	MyConnection c1 = new MyConnection(); // 이렇게 사용할 수없다.
	//	MyConnection. 점을 찍어보면 메서드가 검색이 된다.
		
		MyConnection c1 = MyConnection.getConnection();
		MyConnection c2 = MyConnection.getConnection();
		
		System.out.println(c1); // 여러게가 만들어 졌는지 확인하는 코드
		System.out.println(c2);
		System.out.println(c1==c2); // 이름만 틀리고 같은거다


	}

}
