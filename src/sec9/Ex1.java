package sec9;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child01 child = new Child01("�ڹ���", "����", 10);
		
		System.out.println("��ӹ��� ��: "+child.model);
		System.out.println("��ӹ��� ����: "+child.color);

		System.out.println("�ڽ� Ŭ���� ä��: "+child.channel);
		
		child.powerOn();
		child.bell();
		child.sendVoice("�ȳ��ϼ���.");
		child.receiveVoice("�ȳ��ϼ���.");
		child.sendVoice("���� �� �����Ű���?");
		child.hongUp();
		
		child.turnOn();
		child.changeChannel(67);
		child.turnOff();

	}

}
