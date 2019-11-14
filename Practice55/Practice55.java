//컴퓨터학과 20190975 신효경
import java.util.Scanner;
public class Practice55 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Plane jeju = new Plane();
		System.out.println("제주행 비행기의 정보를 입력하세요.");
		System.out.print("식별번호 : ");
		jeju.setId(input.nextInt());
		System.out.print("모델 : ");
		jeju.setModel(input.next());
		System.out.print("승객수 : ");
		jeju.setCapacity(input.nextInt());
		
		System.out.println("제주행 비행기의 정보입니다.");
		System.out.println(jeju.toString());		

		System.out.println("서울행 비행기의 정보를 입력하세요.");
		System.out.print("식별번호 : ");
		int sid = input.nextInt();
		System.out.print("모델 : ");
		String smodel = input.next();
		System.out.print("승객수 : ");
		int scapacity = input.nextInt();
		Plane seoul = new Plane(sid, smodel, scapacity);
		
		
		System.out.println("서울행 비행기의 정보입니다.");
		System.out.println(seoul.toString());
		
		input.close();
	}

}
