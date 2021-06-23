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
			System.out.println(loc + " 타이어 " + "남은 수명" + (maxRot - cumRot) + "만큼 남았습니다.");
			return true;
		} else {
			System.out.println(loc + "타이어를 교체하세요.");
			return false;
		}
	}
}
