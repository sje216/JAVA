package sec9;

public class Ex7 {
	public static void main(String[] args) {
		Parent07 parentA = new Child07(); // 먼저 child 객체를 parent로 받았기 때문에 다시 child로 변환이 가능
		method1(parentA);

		Parent07 parentB = new Parent07();
		method1(parentB);
	}

	public static void method1(Parent07 parent) {
		if (parent instanceof Child07) {
			Child07 Child = (Child07) parent;
			System.out.println("method1 -Child 로 변환성공");
		} else {
			System.out.println("method1 -Child 로 변환실패");

		}
	}
}
