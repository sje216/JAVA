package sec9;

public class Child02 extends Parent02{
	int studentNo;
	public Child02(String name,String ssn,int studentNo) {
		super(name,ssn); //부모 클래스에 매개 변수 받는 생성자가 있기 때문에 super 호출
		this.studentNo = studentNo;
	}
}
