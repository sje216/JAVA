package sec9;
import java.util.Scanner;
public class Ex3 {

	public static void main(String[] args) {
		// 상속 제한 접근
		Child03 c = new Child03();
		c.m();
		System.out.println(Parent03.a);
		c.me();
		System.out.println(Parent03.a);
	}

}
