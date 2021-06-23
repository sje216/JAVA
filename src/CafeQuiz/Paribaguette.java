package CafeQuiz;

public class Paribaguette {
	Product cd;
	Product rb;
	Product mb;

	Paribaguette(int p1, int p2, int p3) {
		cd = new CreamDonut(p1);
		rb = new RedbeanBread(p2);
		mb = new MoccaBread(p3);
	}
}

class CreamDonut extends Product {
	CreamDonut(int price) {
		super(price);
	}
	public String toString() {
		return "Å©¸²»§";
	}
}

class RedbeanBread extends Product {
	RedbeanBread(int price) {
		super(price);
	}

	public String toString() {
		return "´ÜÆÏ»§";
	}
}

class MoccaBread extends Product {
	MoccaBread(int price) {
		super(price);
	}

	public String toString() {
		return "¸ðÄ«»§";
	}
}

class CoffeeShop {
	Product a;
	Product c;
	Product ca;

	CoffeeShop(int p1, int p2, int p3) {
		a = new Americano(p1);
		c = new Caferatte(p2);
		ca = new Capucchino(p3);
	}
}

class Product {
	int price;

	Product(int price) {
		this.price = price;
	}
}

class Americano extends Product {
	Americano(int price) {
		super(price);
	}
	public String toString() {
		return "¾Æ¸Þ¸®Ä«³ë";
	}
}

class Caferatte extends Product {
	Caferatte(int price) {
		super(price);
	}public String toString() {
		return "Ä«Æä¶ó¶¼";
	}
}

class Capucchino extends Product {
	Capucchino(int price) {
		super(price);
	}public String toString() {
		return "Ä«ÇªÄ¡³ë";
	}
}
