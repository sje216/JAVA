package sec9;

public class Child03 extends Parent03 {
	private String id  = "Child";
	
	public void m() {
		System.out.println(super.lastName);
//		System.out.println(super.firstName); //firstname 은 priavate 접근제한자이기 때문에
		System.out.println(super.getFirstName());
	}
	static void me() {
		a=20;
	}
}
