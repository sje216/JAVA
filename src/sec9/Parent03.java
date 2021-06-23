package sec9;

public class Parent03 {
	public String lastName = "김";
	private String firstName = "유진";
	static int a =10; //static 모든 객체가 메모리를 공유

	private void method() {
		System.out.println("나는 부모클래스 입니다.");

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