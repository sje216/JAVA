package Quiz;

public class HankookTire extends Tire {

	public HankookTire(String loc, int maxRot) {
		super(loc, maxRot);
	}

	@Override
	public boolean roll() {
		cumRot++;
		if (cumRot < maxRot) {
			System.out.println(loc + " �ѱ� Ÿ�̾� ������ " + (maxRot - cumRot) + "��ŭ ���ҽ��ϴ�.");
			return true; // �Լ��� ���� �����Ŵ
		} else {
			System.out.println(loc + " �ѱ� Ÿ�̾ ��ü�ϼ���.");
			return false;
		}
	}

}
