package sec9;

public class MyDate {
	int year;
	int month;
	int day;
	
	public MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public String toString() {
		return year + "/" + month+ "/"+day;
	}
}
