package sec9;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child01 child = new Child01("자바폰", "검정", 10);
		
		System.out.println("상속받은 모델: "+child.model);
		System.out.println("상속받은 색상: "+child.color);

		System.out.println("자식 클래스 채널: "+child.channel);
		
		child.powerOn();
		child.bell();
		child.sendVoice("안녕하세요.");
		child.receiveVoice("안녕하세요.");
		child.sendVoice("무슨 일 있으신가요?");
		child.hongUp();
		
		child.turnOn();
		child.changeChannel(67);
		child.turnOff();

	}

}
