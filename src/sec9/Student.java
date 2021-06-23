package sec9;

public class Student extends Person {
	void set() {
		age = 30;
		name = "ȫ�浿";
		height = 175;
		setWeight(99);
		System.out.println(getWeight());
	}

	public static void main(String[] args) {
		Student s = new Student();
		s.set();
	}
}
