package sec9;

public class CarMain {

	public static void main(String[] args) {
		// 레이서를 부른다
		Racer r = new Racer();
		Car f = new Ferrari();
		Car m = new Maserati();
		r.drive(m);
		r.drive(f);
		
	}

}
