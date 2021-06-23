package sec9;

public class Ex9 {
	public static void func(People people) {
		people.printInfo();
	}
	public static void main(String[] args) {
		People man = new Man();
		People woman = new Woman();
		func(man);
		
		System.out.println();
		func(woman);
	}

}
