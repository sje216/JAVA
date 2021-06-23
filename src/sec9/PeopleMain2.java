package sec9;

public class PeopleMain2 {
	public static void func(People p) {
		p.printInfo();
		if(p instanceof Man) {
			((Man)p).enlist();
		}
		if(p instanceof Woman) {
			((Woman)p).working();
		}
	}
	public static void main(String[] args) {
		People man = new Man();
		People woman = new Woman();
		func(man);
		
		System.out.println();
		func(woman);

	}

}
