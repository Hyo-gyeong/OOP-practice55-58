//컴퓨터학과 20190975 신효경
public class Date {

	private int year; 
	private int month; 
	private int day;
	
	public String toString() {
		return year+"년 "+month+"월 "+day+"일";
	}
	
	public static int compareDate(Date x, Date y)  {
		if (x.year == y.year) {
			if (x.month == y.month) {
				if (x.day == y.day) {
					return 0;
				}
				else if (x.day < y.day) {
					return -1;
				}
				else {
					return 1;
				}
			}
			else if (x.month < y.month) {
				return -1;
			}
			else {
				return 1;
			}
				
		}
		else if (x.year < y.year) {
			return -1;
		}
		else
			return 1;
		
	}
	
	public Date(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public Date() {
		this(1900, 1, 1);
	}
	// 설정자 메소드 수정 // 접근자 메소드
	 public void setYear(int year) 
	 {
		this.year = year;
	 }
	 public int getYear()
	 {
		 return year;
	 }
	 
	 public void setMonth(int month) 
	 {
		this.month = month;
	 }
	 public int getMonth()
	 {
		 return month;
	 }
	 
	 public void setDay(int day) 
	 {
		this.day = day; 
	 }
	 public int getDay()
	 {
		 return day;
	 }

}
