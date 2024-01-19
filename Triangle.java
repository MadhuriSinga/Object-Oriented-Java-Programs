package week7;

public class Triangle extends Figure {
	public Triangle(double dim1,double dim2) {
		super(dim1,dim2);
	}
	public void area() {
		double ar=0.5*dim1*dim2;
		System.out.println("Area of triangle: "+ar);
	}
}
