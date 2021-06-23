package sec9;

public class Q2 {

	public static void main(String[] args) {
		Spell[] mage = new Spell[3];
		
		mage[0] = new Fire();
		mage[1] = new Light();
		mage[2] = new Ice();
		
		for(int i=0;i<mage.length;i++) {
			System.out.println(mage[i].casting());
		}

	}

}
