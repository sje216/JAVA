package sec9;

public class Child03 extends Parent03 {
	private String id  = "Child";
	
	public void m() {
		System.out.println(super.lastName);
//		System.out.println(super.firstName); //firstname �� priavate �����������̱� ������
		System.out.println(super.getFirstName());
	}
	static void me() {
		a=20;
	}
}
