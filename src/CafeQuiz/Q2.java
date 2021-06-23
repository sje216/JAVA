package CafeQuiz;

public class Q2 {

	public static void main(String[] args) {
		Paribaguette bread = new Paribaguette(1000, 1500, 2000);
		System.out.println("단팥빵의 가격:" + bread.rb.price);
		CoffeeShop cafe = new CoffeeShop(1000, 2000, 3000);
		System.out.println("카푸치노의 가격:" + cafe.ca.price);
		Man m = new Man();
		m.buy(bread.cd);// 크림도넛 구매
		m.buy(bread.rb);// 단팥빵 구매
		m.buy(bread.mb);// 모카빵 구매
		System.out.println(m.total);
		m.buy(cafe.a);// 아메리카노 구매
		m.buy(cafe.c);// 카페라테 구매
		m.buy(cafe.ca);// 카푸치노 구매
//		System.out.println(m.total);
		m.total();

	}

}
