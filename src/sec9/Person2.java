package sec9;

public class Person2 {
	String phone;

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}

class Professor2 extends Person2 {
	public String getPhone() {
		return "Professor : " + super.getPhone();
	}
}