package sec9;

public class Child01 extends Parent01{
	int channel;
	Child01(String model, String color,int channel){
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	void turnOn() {
		System.out.println("ä�� : "+channel+"�� ����� �����մϴ�.");
	}
	void changeChannel(int channel) {
		System.out.println("ä���� "+channel+"������ �����մϴ�.");
	}
	void turnOff() {
		System.out.println("����� �ߴ��մϴ�.");
	}
}
