package Quiz;

public class KumhoTire extends Tire {

	public KumhoTire(String loc, int maxRot) {
		super(loc, maxRot);
	}

	@Override
	public boolean roll() {
		cumRot++;
		if (cumRot < maxRot) {
			System.out.println(loc + " ��ȣ Ÿ�̾� ������ " + (maxRot - cumRot) + "��ŭ ���ҽ��ϴ�.");
			return true; // �Լ��� ���� �����Ŵ
		} else {
			System.out.println(loc + " ��ȣ Ÿ�̾ ��ü�ϼ���.");
			return false;
		}
	}

}
