package Quiz;

public class CarEx {

	public static void main(String[] args) {
		Car c = new Car();
		for (int i = 0; i < 5; i++) {
			int num = c.run();
			switch (num) {
			case 1:
				System.out.println("앞 왼쪽 타이어를 교체");
				c.frontLeft = new KumhoTire("앞왼쪽",3);
				break;
			case 2:
				System.out.println("앞 오른쪽 타이어를 교체");
				c.frontRight = new HankookTire("앞오른쪽",4);
				break;
			case 3:
				System.out.println("뒤 왼쪽 타이어를 교체");
				c.frontRight = new HankookTire("뒤왼쪽",12);
				break;
			case 4:
				System.out.println("뒤 오른쪽 타이어를 교체");
				c.frontLeft = new KumhoTire("뒤오른쪽",6);
				break;
			}
		}
	}

}
