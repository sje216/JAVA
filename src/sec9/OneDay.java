package sec9;

public class OneDay extends Event {
	public MyDate date;

	public OneDay(String title, MyDate date) {
		super(title);
		this.date = date;
	}

	public String toString() {
		return title + ", " + date.toString();
	}
}
