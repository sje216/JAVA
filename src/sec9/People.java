package sec9;

public class People {
	public void printInfo() {
		System.out.println("나는 사람입니다.");
	}
}

class Man extends People {
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("그리고 남자입니다.");
	}

	public void enlist() {
		System.out.println("내일 군대갑니다.");
		System.out.println("충성!");
	}

}

class Woman extends People {
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("그리고 여자입니다.");
	}

	public void working() {
		System.out.println("일을 합니다.");
		System.out.println("최선을 다해");
	}
}