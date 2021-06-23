//package sec9;
//
//public class Product {
//	int price;
//	int bonusPoint;
//
//	Product(int price) {
//		this.price = price;
//		this.bonusPoint = (int) (price / 10.0);
//	}
//}
//
//class Tv2 extends Product {
//	Tv2() {
//		super(100);
//	}
//
//	public String toString() {
//		return "Tv2";
//	}
//}
//
//class Computer extends Product {
//	Computer() {
//		super(200);
//	}
//
//	public String toString() {
//		return "Computer";
//	}
//}
//
//class Audio extends Product {
//	Audio() {
//		super(300);
//	}
//
//	public String toString() {
//		return "Audio";
//	}
//}
//
//class Buyer {
//	int money = 1000;
//	int bonusPoint = 0;
//
////	void buy(Tv2 t) {
////		money -= t.price;
////		bonusPoint += t.bonusPoint;
////	}
////	void buy(Computer c) {
////		money -= c.price;
////		bonusPoint += c.bonusPoint;
////	}
////	void buy(Audio a) {
////		money -= a.price;
////		bonusPoint += a.bonusPoint;
////	}
//	void buy(Product p) {
//		if(money<p.price) {
//			System.out.println("잔액이 부족합니다.");
//			return;
//		}
//		money -= p.price;
//		bonusPoint += p.bonusPoint;
//		System.out.println(p.toString()+"을/를 구입하셨습니다.");
////		money -= p.price;
////		bonusPoint += p.bonusPoint;
//	}
//}