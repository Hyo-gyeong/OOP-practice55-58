//��ǻ���а� 20190975 ��ȿ��
import java.util.Scanner;
public class Practice57 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		Movie m1 = new Movie();
		System.out.println("��ȭ ������ �Է��ϼ���.");
		m1.setMid(m1.getMid());
		System.out.print("��ȭ������?");
		m1.setTitle(input.next());
		System.out.print("������?");
		m1.setDirector(input.next());
		System.out.print("���۳⵵��?");
		m1.setYear(input.nextInt());
		
		Movie m2 = new Movie();
		System.out.println("\n��ȭ ������ �Է��ϼ���.");
		m2.setMid(m2.getMid());
		System.out.print("��ȭ������?");
		m2.setTitle(input.next());
		System.out.print("������?");
		m2.setDirector(input.next());
		System.out.print("���۳⵵��?");
		m2.setYear(input.nextInt());
		
		Movie m3 = new Movie();
		System.out.println("\n��ȭ ������ �Է��ϼ���.");
		m3.setMid(m3.getMid());
		System.out.print("��ȭ������?");
		m3.setTitle(input.next());
		System.out.print("������?");
		m3.setDirector(input.next());
		System.out.print("���۳⵵��?");
		m3.setYear(input.nextInt());
		
		System.out.println("\n�Է��� ��ȭ�� �����Դϴ�.");
		
		System.out.println("\n"+m1.toString());
		System.out.println("\n"+m2.toString());
		System.out.println("\n"+m3.toString());
		System.out.println();
		
		String rslt;
		rslt = Movie.compareMovies(m1, m2);
		System.out.print(rslt);
		rslt = Movie.compareMovies(m1, m3);
		System.out.print(rslt);
		rslt = Movie.compareMovies(m2, m3);
		System.out.print(rslt);
		
		input.close(); 
	}

}
