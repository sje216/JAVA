package CafeQuiz;

public class Man {
	int total;
	public Man() {}
	public void buy(Product p) {
		System.out.println(p+" ����"+"(���� : "+p.price+")");
		total+=p.price;
//		System.out.println("�Ѿ��� "+total+"���Դϴ�.");
		
	}
	public void total() {
//		total+=p.price;
		System.out.println("�Ѿ��� "+total+"���Դϴ�.");
	}
}
