package sec9;

public class Parent03 {
	public String lastName = "��";
	private String firstName = "����";
	static int a =10; //static ��� ��ü�� �޸𸮸� ����

	private void method() {
		System.out.println("���� �θ�Ŭ���� �Դϴ�.");

	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
}