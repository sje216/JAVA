package sec9;

public class Ex7 {
	public static void main(String[] args) {
		Parent07 parentA = new Child07(); // ���� child ��ü�� parent�� �޾ұ� ������ �ٽ� child�� ��ȯ�� ����
		method1(parentA);

		Parent07 parentB = new Parent07();
		method1(parentB);
	}

	public static void method1(Parent07 parent) {
		if (parent instanceof Child07) {
			Child07 Child = (Child07) parent;
			System.out.println("method1 -Child �� ��ȯ����");
		} else {
			System.out.println("method1 -Child �� ��ȯ����");

		}
	}
}
