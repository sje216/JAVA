package CafeQuiz;

public class Man {
	int total;
	public Man() {}
	public void buy(Product p) {
		System.out.println(p+" 구매"+"(가격 : "+p.price+")");
		total+=p.price;
//		System.out.println("총액은 "+total+"원입니다.");
		
	}
	public void total() {
//		total+=p.price;
		System.out.println("총액은 "+total+"원입니다.");
	}
}
