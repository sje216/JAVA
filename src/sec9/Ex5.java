package sec9;

public class Ex5 {

	public static void main(String[] args) {
		Child05 c = new Child05();
		c.takeOff();
		c.fly();
		c.flymode = c.supersonic;
		c.fly();
		c.flymode = c.normal;
		c.fly();
		c.land();

	}

}
