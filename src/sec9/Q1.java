package sec9;

//import java.io.IOException;
public class Q1 {

	public static void main(String[] args) {
		Event[] evt = new Event[3];
		MyDate date1 = new MyDate(2021, 6, 17);
		MyDate date2 = new MyDate(2021, 6, 04);
		MyDate date3 = new MyDate(2021, 10, 30);

		evt[0] = new OneDay("����", date1);
		evt[1] = new Duration("java", date2, date3);
		evt[2] = new DeadLined("������¥", date3);

		for (int i = 0; i < evt.length; i++) {
			System.out.println("����: " + evt[i].toString());
		}
	}

}
