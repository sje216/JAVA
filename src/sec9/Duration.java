package sec9;

public class Duration extends Event {
	public MyDate begin;
	public MyDate end;

	public Duration(String title, MyDate begin, MyDate end) {
		super(title);
		this.begin = begin;
		this.end = end;
	}

	public String toString() {
		return title + ", " + "시작 날짜: " + begin.toString() + ", 마감날짜:  " + end.toString();
	}

}
