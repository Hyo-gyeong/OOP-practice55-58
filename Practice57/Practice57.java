//컴퓨터학과 20190975 신효경
import java.util.Scanner;
public class Practice57 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		Movie m1 = new Movie();
		System.out.println("영화 정보를 입력하세요.");
		m1.setMid(m1.getMid());
		System.out.print("영화제목은?");
		m1.setTitle(input.next());
		System.out.print("감독은?");
		m1.setDirector(input.next());
		System.out.print("제작년도는?");
		m1.setYear(input.nextInt());
		
		Movie m2 = new Movie();
		System.out.println("\n영화 정보를 입력하세요.");
		m2.setMid(m2.getMid());
		System.out.print("영화제목은?");
		m2.setTitle(input.next());
		System.out.print("감독은?");
		m2.setDirector(input.next());
		System.out.print("제작년도는?");
		m2.setYear(input.nextInt());
		
		Movie m3 = new Movie();
		System.out.println("\n영화 정보를 입력하세요.");
		m3.setMid(m3.getMid());
		System.out.print("영화제목은?");
		m3.setTitle(input.next());
		System.out.print("감독은?");
		m3.setDirector(input.next());
		System.out.print("제작년도는?");
		m3.setYear(input.nextInt());
		
		System.out.println("\n입력한 영화의 정보입니다.");
		
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
