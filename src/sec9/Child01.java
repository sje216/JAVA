package sec9;

public class Child01 extends Parent01{
	int channel;
	Child01(String model, String color,int channel){
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	void turnOn() {
		System.out.println("채널 : "+channel+"번 방송을 수신합니다.");
	}
	void changeChannel(int channel) {
		System.out.println("채널을 "+channel+"번으로 변경합니다.");
	}
	void turnOff() {
		System.out.println("방송을 중단합니다.");
	}
}
