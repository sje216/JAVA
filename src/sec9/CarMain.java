package sec9;

public class CarMain {

	public static void main(String[] args) {
		// ���̼��� �θ���
		Racer r = new Racer();
		Car f = new Ferrari();
		Car m = new Maserati();
		r.drive(m);
		r.drive(f);
		
	}

}
