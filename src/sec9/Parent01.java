package sec9;

public class Parent01 {
	String model;
	String color;

	void powerOn() {
		System.out.println("전원을 켭니다.");
	}

	void powerOff() {
		System.out.println("전원을 켭니다.");
	}

	void bell() {
		System.out.println("전원을 켭니다.");
	}

	void sendVoice(String message) {
		System.out.println("자신 : " + message);
	}

	void receiveVoice(String message) {
		System.out.println("상대방 : " + message);
	}

	void hongUp() {
		System.out.println("전화를 끊습니다.");
	}
}
