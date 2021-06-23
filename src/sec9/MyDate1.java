package sec9;

public class MyDate1 {
		int year;
		int month;
		int day;

		public MyDate1(int year, int month, int day) {
			this.year = year;
			this.month = month;
			this.day = day;
		}

		public String toString() {
			return year + "/" + month + "/" + day;
		}

}
