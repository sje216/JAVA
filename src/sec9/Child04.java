package sec9;

public class Child04 extends Parent04 {
	int age = 25;

	@Override
	public void info() {
//		System.out.println("�ڽİ�ü info() �̸�: " + this.name);
//		System.out.println("�ڽİ�ü info() ����: " + this.age);
		super.info();
		System.out.println("�ڽİ�ü info() ����: " + this.age);

	}
}
