package Quiz;

public class Car {
	Tire frontLeft = new Tire("앞왼쪽", 5);
	Tire frontRight = new Tire("앞오른쪽", 2);
	Tire backLeft = new Tire("뒤왼쪽", 7);
	Tire backRight = new Tire("뒤오른쪽", 6);

	public int run() {
		System.out.println("차가 달립니다.");
		if (frontLeft.roll() == false) {
			stop();
			return 1;
		}
		if (frontRight.roll() == false) {
			stop();
			return 2;
		}
		if (backLeft.roll() == false) {
			stop();
			return 3;
		}
		if (backRight.roll() == false) {
			stop();
			return 4;
		}
		return 0;
	}

	public void stop() {
		System.out.println("자동차가 멈춘다.");
	}

}
