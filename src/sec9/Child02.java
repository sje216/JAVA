package sec9;

public class Child02 extends Parent02{
	int studentNo;
	public Child02(String name,String ssn,int studentNo) {
		super(name,ssn); //�θ� Ŭ������ �Ű� ���� �޴� �����ڰ� �ֱ� ������ super ȣ��
		this.studentNo = studentNo;
	}
}
