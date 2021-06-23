package Quiz;

public class Tire {
	public int maxRot;
	public int cumRot;
	public String loc;

	public Tire(String loc, int maxRot) {
		this.maxRot = maxRot;
		this.loc = loc;
	}

	public boolean roll() {
		cumRot++;
		if (cumRot < maxRot) {
			System.out.println(loc + " Ÿ�̾� " + "���� ����" + (maxRot - cumRot) + "��ŭ ���ҽ��ϴ�.");
			return true;
		} else {
			System.out.println(loc + "Ÿ�̾ ��ü�ϼ���.");
			return false;
		}
	}
}
