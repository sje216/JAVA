package sec9;

public class ShapeMain {
	static void paint(Shape s) {
		s.draw();
	}

	public static void main(String[] args) {
		Shape l = new Line();
		l.draw();
//		Shape s = paint(new Shape);
		paint(new Shape());
		paint(new Line());
		paint(new Rect());
		paint(new Circle());

	}

}
