package CafeQuiz;

public class Q2 {

	public static void main(String[] args) {
		Paribaguette bread = new Paribaguette(1000, 1500, 2000);
		System.out.println("���ϻ��� ����:" + bread.rb.price);
		CoffeeShop cafe = new CoffeeShop(1000, 2000, 3000);
		System.out.println("īǪġ���� ����:" + cafe.ca.price);
		Man m = new Man();
		m.buy(bread.cd);// ũ������ ����
		m.buy(bread.rb);// ���ϻ� ����
		m.buy(bread.mb);// ��ī�� ����
		System.out.println(m.total);
		m.buy(cafe.a);// �Ƹ޸�ī�� ����
		m.buy(cafe.c);// ī����� ����
		m.buy(cafe.ca);// īǪġ�� ����
//		System.out.println(m.total);
		m.total();

	}

}
