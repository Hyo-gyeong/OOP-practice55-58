//컴퓨터학과 20190975 신효경
import java.util.Scanner;
public class Practice58 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		BankAccount b0 = new BankAccount("김동덕", 100, 3.1);
		BankAccount b1 = new BankAccount("홍길동", 2000, 2.15);
		BankAccount b2 = new BankAccount("성춘향", 500, 2.05);
		
		System.out.println("은행 계좌 모두의 정보입니다.");
		System.out.println(b0.toString());
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		
		System.out.println();
		System.out.print("계좌 "+b0.getAccountNo()+"에 입금할 금액을 입력하세요: ");
		int add = input.nextInt();
		b0.deposit(add);
		
		if (b0.deposit(add) == true) {
			System.out.println("입금이 성공했습니다.");
			b0.setBalance(b0.getBalance() + add);
		}
		else {
			System.out.println("입금이 실패했습니다.");
		}
		
		System.out.println();
		System.out.println("은행 계좌 모두의 정보입니다.");
		System.out.println(b0.toString());
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		
		System.out.println();
		System.out.print("계좌 "+b1.getAccountNo()+"에 출금할 금액을 입력하세요: ");
		int remove = input.nextInt();
		b1.withdraw(remove);
		
		if (b1.withdraw(remove) == true) {
			System.out.println("출금이 성공했습니다.");
			b1.setBalance(b1.getBalance() - remove);
		}
		else {
			System.out.println("출금이 실패했습니다.");
		}
		
		System.out.println();
		System.out.println("은행 계좌 모두의 정보입니다.");
		System.out.println(b0.toString());
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		
		System.out.println("계좌 "+b1.getAccountNo()+"에서 계좌 "+b2.getAccountNo()+"으로 송금할 금액을 입력하세요: ");
		int send = input.nextInt();
		//BankAccount.transfer(b1, b2, send); 함수 두 번 실행됨
		
		if (BankAccount.transfer(b1, b2, send) == true) { // 함수 두 번 실행됨
			System.out.println("송금이 성공했습니다.");
		}
		else {
			System.out.println("송금이 실패했습니다.");
		}
		
		System.out.println();
		System.out.println("은행 계좌 모두의 정보입니다.");
		System.out.println(b0.toString());
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		
		input.close();
	}

}
