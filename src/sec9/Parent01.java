package sec9;

public class Parent01 {
	String model;
	String color;

	void powerOn() {
		System.out.println("������ �մϴ�.");
	}

	void powerOff() {
		System.out.println("������ �մϴ�.");
	}

	void bell() {
		System.out.println("������ �մϴ�.");
	}

	void sendVoice(String message) {
		System.out.println("�ڽ� : " + message);
	}

	void receiveVoice(String message) {
		System.out.println("���� : " + message);
	}

	void hongUp() {
		System.out.println("��ȭ�� �����ϴ�.");
	}
}
