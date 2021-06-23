package sec9;

public class PeopleMain {

	public static void main(String[] args) {
		People man = new Man();
		People woman = new Woman();
		
		man.printInfo();
		((Man)man).enlist();
		System.out.println();
		woman.printInfo();
		((Woman)woman).working();

	}

}
