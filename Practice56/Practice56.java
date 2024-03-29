//컴퓨터학과 20190975 신효경
import java.util.Scanner;
public class Practice56 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("첫 번째 날짜를 입력하세요.");
		System.out.print("년도 : ");
		int year1 = input.nextInt();
		System.out.print("월 : ");
		int month1 = input.nextInt();
		System.out.print("일 : ");
		int day1 = input.nextInt();
		Date d1 = new Date(year1, month1, day1);
		
		Date d2 = new Date();
		System.out.println("두 번째 날짜를 입력하세요.");
		System.out.print("년도 : ");
		d2.setYear(input.nextInt());
		System.out.print("월 : ");
		d2.setMonth(input.nextInt());
		System.out.print("일 : ");
		d2.setDay(input.nextInt());
		
		int rslt = Date.compareDate(d1, d2);
		if (rslt == 0) {
			System.out.println("두 날짜는 같은 날짜입니다.");
		}
		else if (rslt == 1) {
			System.out.println("두 번째 날짜인 "+d2.toString()+"이 앞선 날짜입니다");
		}
		else {
			System.out.println("첫 번째 날짜인 "+d1.toString()+"이 앞선 날짜입니다");
		}
		
		input.close();
	}

}
