//컴퓨터학과 20190975 신효경
import java.util.Random;
public class Movie {

	Random rn = new Random();
	
	private String mid;
	private String title;
	private String director;
	private int year;
	
	private String makeID() {
		int s1 = rn.nextInt(1000)+1000;
		int s2 = rn.nextInt(1000)+1000;
		mid = s1+" - "+s2;
		return mid; 
	}

	public void setMid(String mid) { this.mid = makeID(); }
	public String getMid() { return mid; }
	
	public void setTitle(String title) { this.title = title; }
	public String getTitle() { return title; }
	
	public void setDirector(String director) { this.director = director; }
	public String getDirector() { return director;}
	
	public void setYear(int year) { this.year = year; }
	public int getYear() { return year;}
	

	public String toString() {
		return "번호: "+mid+ "\n제목: "+title+"\n감독: "+director+
				"\n제작년도: "+year;
	}
	
	
	private static boolean compareDirector(Movie x, Movie y)
	{
		if (x.director.equals(y.director)) { //문자열==는 값이 아닌 참조(주소)를 비교, 그래서 항상false
			return true;
		}
		else {
			return false;
		}
	}
	
	private static boolean compareYear(Movie x, Movie y)
	{
		if (x.year == y.year) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static String compareMovies(Movie x, Movie y)
	{
		if (Movie.compareDirector(x, y) == true) {
			if (Movie.compareYear(x, y) == true){
				return "영화 "+x.mid+"와 영화 "+y.mid+"는 감독이 같고 제작년도도 같습니다.\n";
			}
			else{
				return "영화 "+x.mid+"와 영화 "+y.mid+"는 감독이 같고 제작년도가 다릅니다.\n";
			}
		}
		else {
			if (Movie.compareYear(x, y) == true){
				return "영화 "+x.mid+"와 영화 "+y.mid+"는 감독이 다르고 제작년도가 같습니다.\n";
			}
			else {
				return "영화 "+x.mid+"와 영화 "+y.mid+"는 감독이 다르고 제작년도도 다릅니다.\n";
			}
		}
	}
	
	
}
