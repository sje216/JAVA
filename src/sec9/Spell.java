package sec9;

public class Spell {
	public String casting() {
		return "�ֹ��� �ܿ��.";
	}
}

class Fire extends Spell {
	public String casting() {
		return "ȭ�� "+super.casting();
	}
}

class Ice extends Spell {
	public String casting() {
		return "���� "+super.casting();
	}
}

class Light extends Spell {
	public String casting() {
		return "�� "+super.casting();
	}
}