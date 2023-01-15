package object_;

public class MyDate { //날짜를 표시하기 위해서 만들어본다
	//제한자 사용, private사용하면 내 클래스에서만 사용하겠다. 다른클래스는 볼수없다. 대신 구멍을 내겠다. 그게 메서드다. 이건 public선언하자
	private int year; //날짜에 해당하는 다양한 속성들
	private int month; //같은 클래스 에서만 볼수 있다.
	private int day; // 다른 클래스에서 손을 못대게 막는다
	
	void getDate() {
		System.out.printf("%d년 %d월 %d일\n",this.year,this.month,this.day);
	}
	
    public void setYear(int year) { //메서드를 퍼블릭으로 선언해서 다른 클래스가 사용할 수 있게 한다.
    	if(year <0) {
    		System.out.println("기원전은 입력할 수 없습니다.");
    		return;
    	}
    	this.year = year;
    	
   // 변수는 privat로 막구 public 메서드로 뚫어 놓는다. 이게 은닉이다.
    }

    //의미 패턴이다
    //source - getter / setter 자동생성
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getYear() {
		return year;
	}
    
}

