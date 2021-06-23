package sec9;

public class Tv {
	boolean power;
	int channel;
	
	void power() {
		power = !power;
	}
	void channelUp() {
		++channel;
	}
	void channelDown() {
		--channel;
	}
	
	
}
//class SmartTv extends Tv() {
//	String test;
//	void caption() {
//		
//	}
//}