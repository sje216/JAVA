package Quiz;

public class Car {
	Tire frontLeft = new Tire("�տ���", 5);
	Tire frontRight = new Tire("�տ�����", 2);
	Tire backLeft = new Tire("�ڿ���", 7);
	Tire backRight = new Tire("�ڿ�����", 6);

	public int run() {
		System.out.println("���� �޸��ϴ�.");
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
		System.out.println("�ڵ����� �����.");
	}

}
