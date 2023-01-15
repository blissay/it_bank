package object_;

import java.awt.Frame;

public class AccountExample {

	public static void main(String[] args) {
		// 은행계좌 확인 
		
		
		Account a1 = new Account("엄영범","0000","신한"); //생성자를 만들면 하나가 생성된다. 이것 자체가 객체지향이다. 
		Account a2 = new Account("박용준","0000","국민");
		a1.deposit(100000);
		a1.withdraw(50000,"1234");
		a1.withdraw(50000,"0000");
		a1.transfer(30000,"0000", a2);
		
		a2.toPrint();
		a2.toPrint();
		
		Frame f = new Frame("myFrame"); // 이렇게 선언하면 사용할수있다. 다른사람이 만든 객체를 불러서 내가 사용할수 잇다.
		f.setVisible(true);

	}

}
