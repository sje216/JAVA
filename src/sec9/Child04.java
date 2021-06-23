package sec9;

public class Child04 extends Parent04 {
	int age = 25;

	@Override
	public void info() {
//		System.out.println("자식객체 info() 이름: " + this.name);
//		System.out.println("자식객체 info() 나이: " + this.age);
		super.info();
		System.out.println("자식객체 info() 나이: " + this.age);

	}
}
