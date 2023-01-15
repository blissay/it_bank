package object_;

public class Account {

		// 계좌를 만들자, 필요한 속성
		long balance; // 잔액
		String accountNumber; // 계좌번호는 100. 3333등 은행마다 틀리므로 숫자말고 문자로 처리한다.
		String name;
		String password;
		String bankName;
	
		void deposit(long money) { // 입금은 이렇게 가볍게 처리 가능
			this.balance += money;
			System.out.println(this.name+"님의 계좌로 "+money+"원 입금되었습니다.");
			System.out.println("잔액 : "+this.balance+"원.");
		}
		
		// 출금은 복잡하다. 비밀번호 체크가 필요한데 송금할대 출금할대 잔액조회할때 또 필요하므로 따로 메서드로 만들어 놓는것이 좋다
		boolean checkPassword(String password) {
			return this.password.equals(password);
		}
		
		
		void withdraw(long money, String password) { //비밀번호 체크가 필요하다, 비밀번호가 맞으면 실행시키다.
			if(checkPassword(password)) { //비밀번호가 맞으면 잔고가 있는지 확인을 해야한다. if 중첩문 사용
				if(this.balance - money <0 ) { //잔고가 출금할 돈보다 작다면
					System.out.println("잔액이 부족합니다.");
				} else { //잔고가 출금할 보다 많다면
					this.balance -= money; //머니를 
					System.out.println(this.name+"님의 계좌에서 "+money+"원 출금되었습니다.");
					System.out.println("잔액 : "+this.balance+"원.");
				}
			} else {
				System.out.println("비밀번호가 다릅니다.");
			}
		}
		
		//송금할때 다른 객체를 들여다 볼수 있는지
		
		void transfer(long money, String password, Account account) { //Account 다른 객체를 가져온다.
			if(checkPassword(password)) { //비밀번호가 맞으면 잔고가 있는지 확인을 해야한다. if 중첩문 사용
				if(this.balance - money <0 ) { //잔고가 출금할 돈보다 작다면
					System.out.println("잔액이 부족합니다.");
				} else { //잔고가 출금할 보다 많다면
					this.balance -= money; //머니를 내 계좌에서 빼준다
					account.balance += money; //송금 받는 사람계좌에 잔고에 money를 더해준다.
					System.out.println(this.name+"님의 계좌에서 "+account.name+"님의 계좌에서"+money+"원 송금되었습니다.");
					System.out.println("잔액 : "+this.balance+"원.");
				}
			} else {
				System.out.println("비밀번호가 다릅니다.");
			}
		}
		
		Account(String name, String password, String bankName){ //계죄번호 자동으로 만들어준다. 
			this.name = name;
			this.password = password;
			this.bankName = bankName;
			this.accountNumber = prefixNumber(bankName); //한자리는 은행코드에 따라 한자리를 가져온다. 그러므로 9자리 만 만들자
			for(int i=0; i<8; i++) {
				accountNumber += (int)(Math.random()*10);
			}
		}
		
		void toPrint() {
			System.out.printf("은행명 : %s, 계좌번호 : %s, 예금주 : %s, 잔액 : %d\n",
					this.bankName, this.accountNumber, this.name, this.balance);
		}
		
		String prefixNumber(String bankname) {
			switch(bankName) {
			case "우리" :
				return "1";
			case "신한" :
				return "2";
			case "국민" : 
				return "3";
			case "하나" :
				return "4";
			default :
				return "0";
			}
		}
		
}
