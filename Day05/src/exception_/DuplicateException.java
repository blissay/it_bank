package exception_;

public class DuplicateException extends RuntimeException {

	public DuplicateException(String message){
		// 사용자 정의 에외 문구를 보여줄 수있다.
		// DuplicateException이 런타임 엑셉션을 상속한다. 
		
		super(message);

	}

}
