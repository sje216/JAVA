package sec9;

public class Child05 extends Parent05 {
	public static final int normal = 1;
	public static final int supersonic = 2;

	public int flymode = normal;

	@Override
	public void fly() {
		if (flymode == supersonic) {
			System.out.println("������ �������Դϴ�.");
		} else {
			super.fly();
		}
	}
}
