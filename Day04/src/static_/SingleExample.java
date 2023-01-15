package static_;

public class SingleExample {

	public static void main(String[] args) {
		// 싱글턴 디자인 페턴이다
		// 네이버 프로그램서버에서 데이타 베이스 라인에 제한을 줘야 한다.
		
	//	MyConnection c1 = new MyConnection(); // 이렇게 사용할 수없다.
	//	MyConnection. 점을 찍어보면 메서드가 검색이 된다.
		
		MyConnection c1 = MyConnection.getConnection(); // MyConnectin 클래스에서 메서드를 불러서 사용할 수 있다.
		MyConnection c2 = MyConnection.getConnection(); // private로 막은 클래스를 사용할 수 있는 방법. 은닉되어있음.
		
		System.out.println(c1); // 여러게가 만들어 졌는지 확인하는 코드
		System.out.println(c2);
		System.out.println(c1==c2); // 이름만 틀리고 같은거다
		
		


	}

}

//결과 static_.MyConnection@1877ab81 // c1,c2가 같은 값과 주소를 가진다.
//     static_.MyConnection@1877ab81
//     true
