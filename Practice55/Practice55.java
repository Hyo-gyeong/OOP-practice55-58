//��ǻ���а� 20190975 ��ȿ��
import java.util.Scanner;
public class Practice55 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Plane jeju = new Plane();
		System.out.println("������ ������� ������ �Է��ϼ���.");
		System.out.print("�ĺ���ȣ : ");
		jeju.setId(input.nextInt());
		System.out.print("�� : ");
		jeju.setModel(input.next());
		System.out.print("�°��� : ");
		jeju.setCapacity(input.nextInt());
		
		System.out.println("������ ������� �����Դϴ�.");
		System.out.println(jeju.toString());		

		System.out.println("������ ������� ������ �Է��ϼ���.");
		System.out.print("�ĺ���ȣ : ");
		int sid = input.nextInt();
		System.out.print("�� : ");
		String smodel = input.next();
		System.out.print("�°��� : ");
		int scapacity = input.nextInt();
		Plane seoul = new Plane(sid, smodel, scapacity);
		
		
		System.out.println("������ ������� �����Դϴ�.");
		System.out.println(seoul.toString());
		
		input.close();
	}

}
