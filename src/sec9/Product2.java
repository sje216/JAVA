package sec9;

public class Product2 {
	int price;
	int bonusPoint;

	Product2(int price) {
		this.price = price;
		this.bonusPoint = (int) (price / 10.0);
	}
}

class Tv2 extends Product2 {
	Tv2() {
		super(420);
	}

	public String toString() {
		return "Tv";
	}
}

class PlayStation extends Product2 {
	PlayStation() {
		super(120);
	}

	public String toString() {
		return "PlayStation";
	}
}

class Computer extends Product2 {
	Computer() {
		super(300);
	}

	public String toString() {
		return "Computer";
	}
}

class Audio extends Product2 {
	Audio() {
		super(40);
	}

	public String toString() {
		return "Audio";
	}
}

class Buyer {
	Product2[] cart = new Product2[3];
	int money = 10000;
	int bonusPoint = 0;
	int i;

	public void buy(Product2 p) {
		if (money <= p.price) {
			System.out.println("잔액 부족");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + " 구입");
		add(p);
	}

	private void add(Product2 p) {
		if (i >= cart.length) {
			Product2[] cart2 = new Product2[cart.length * 2];
			System.arraycopy(cart, 0, cart2, 0, cart.length);
			cart = cart2;
		}
		cart[i++] = p;
		return;
	}

	void summary() {
		String itemList = "";
		int sum = 0;
		for (int i = 0; i < cart.length; i++) {
			if (cart[i] == null)
				break;
			itemList += cart[i] + ",";
			sum += cart[i].price;
		}
		System.out.println("구입한 물건:" + itemList);
		System.out.println("사용한 금액:" + sum);
		System.out.println("보너스 포인트:" + bonusPoint);
		System.out.println("남은 금액:" + money);

	}

}