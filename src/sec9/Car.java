package sec9;

public class Car {
	public void run() {
		System.out.println("�ڵ����� �޸���.");
	}
}

class Ferrari extends Car {
	@Override
	public void run() {
		System.out.println("��󸮰� �޸���.");
	}
}

class Maserati extends Car {
	@Override
	public void run() {
		System.out.println("������Ƽ�� �޸���.");
	}
}

class Racer {
	public void drive(Car car) {
		car.run();
	}
}