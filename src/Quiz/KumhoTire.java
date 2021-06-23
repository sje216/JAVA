package Quiz;

public class KumhoTire extends Tire {

	public KumhoTire(String loc, int maxRot) {
		super(loc, maxRot);
	}

	@Override
	public boolean roll() {
		cumRot++;
		if (cumRot < maxRot) {
			System.out.println(loc + " 금호 타이어 수명이 " + (maxRot - cumRot) + "만큼 남았습니다.");
			return true; // 함수를 강제 종료시킴
		} else {
			System.out.println(loc + " 금호 타이어를 교체하세요.");
			return false;
		}
	}

}
