//��ǻ���а� 20190975 ��ȿ��
import java.util.Scanner;
public class Practice58 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		BankAccount b0 = new BankAccount("�赿��", 100, 3.1);
		BankAccount b1 = new BankAccount("ȫ�浿", 2000, 2.15);
		BankAccount b2 = new BankAccount("������", 500, 2.05);
		
		System.out.println("���� ���� ����� �����Դϴ�.");
		System.out.println(b0.toString());
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		
		System.out.println();
		System.out.print("���� "+b0.getAccountNo()+"�� �Ա��� �ݾ��� �Է��ϼ���: ");
		int add = input.nextInt();
		b0.deposit(add);
		
		if (b0.deposit(add) == true) {
			System.out.println("�Ա��� �����߽��ϴ�.");
			b0.setBalance(b0.getBalance() + add);
		}
		else {
			System.out.println("�Ա��� �����߽��ϴ�.");
		}
		
		System.out.println();
		System.out.println("���� ���� ����� �����Դϴ�.");
		System.out.println(b0.toString());
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		
		System.out.println();
		System.out.print("���� "+b1.getAccountNo()+"�� ����� �ݾ��� �Է��ϼ���: ");
		int remove = input.nextInt();
		b1.withdraw(remove);
		
		if (b1.withdraw(remove) == true) {
			System.out.println("����� �����߽��ϴ�.");
			b1.setBalance(b1.getBalance() - remove);
		}
		else {
			System.out.println("����� �����߽��ϴ�.");
		}
		
		System.out.println();
		System.out.println("���� ���� ����� �����Դϴ�.");
		System.out.println(b0.toString());
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		
		System.out.println("���� "+b1.getAccountNo()+"���� ���� "+b2.getAccountNo()+"���� �۱��� �ݾ��� �Է��ϼ���: ");
		int send = input.nextInt();
		BankAccount.transfer(b1, b2, send);
		
		if (BankAccount.transfer(b1, b2, send) == true) {
			System.out.println("�۱��� �����߽��ϴ�.");
		}
		else {
			System.out.println("�۱��� �����߽��ϴ�.");
		}
		
		System.out.println();
		System.out.println("���� ���� ����� �����Դϴ�.");
		System.out.println(b0.toString());
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		
		input.close();
	}

}
