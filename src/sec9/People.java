package sec9;

public class People {
	public void printInfo() {
		System.out.println("���� ����Դϴ�.");
	}
}

class Man extends People {
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("�׸��� �����Դϴ�.");
	}

	public void enlist() {
		System.out.println("���� ���방�ϴ�.");
		System.out.println("�漺!");
	}

}

class Woman extends People {
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("�׸��� �����Դϴ�.");
	}

	public void working() {
		System.out.println("���� �մϴ�.");
		System.out.println("�ּ��� ����");
	}
}