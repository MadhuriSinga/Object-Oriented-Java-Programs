package week7;

public class FigureDemo {

	public static void main(String[] args) {
		Figure fig=new Figure(10,15);
		Rectangle rect=new Rectangle(10,15);
		Triangle tri=new Triangle(10,15);
		Figure f;
		f=rect;
		f.area();
		f=tri;
		f.area();
		f=fig;
		f.area();

	}

}
