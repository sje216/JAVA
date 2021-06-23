package sec9;

public class DeadLined extends Event {
	public MyDate deadline;

	public DeadLined(String title, MyDate deadLine) {
		super(title);
		this.deadline = deadLine;

	}
	
	public String toString() {
		return title + ", " + "~" + deadline;
	}
}
