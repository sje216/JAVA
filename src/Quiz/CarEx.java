package Quiz;

public class CarEx {

	public static void main(String[] args) {
		Car c = new Car();
		for (int i = 0; i < 5; i++) {
			int num = c.run();
			switch (num) {
			case 1:
				System.out.println("�� ���� Ÿ�̾ ��ü");
				c.frontLeft = new KumhoTire("�տ���",3);
				break;
			case 2:
				System.out.println("�� ������ Ÿ�̾ ��ü");
				c.frontRight = new HankookTire("�տ�����",4);
				break;
			case 3:
				System.out.println("�� ���� Ÿ�̾ ��ü");
				c.frontRight = new HankookTire("�ڿ���",12);
				break;
			case 4:
				System.out.println("�� ������ Ÿ�̾ ��ü");
				c.frontLeft = new KumhoTire("�ڿ�����",6);
				break;
			}
		}
	}

}
