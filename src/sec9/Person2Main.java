package sec9;

public class Person2Main {

	public static void main(String[] args) {
		Professor2 a = new Professor2();
		a.setPhone("010-2350-5718");
		System.out.println(a.getPhone());
		Person2 p = a;
		System.out.println(p.getPhone());

	}

}
