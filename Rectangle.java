package week7;

public class Rectangle extends Figure {
	public Rectangle(double dim1,double dim2) {
		super(dim1,dim2);
    } 
	public void area() {
		double ar=dim1*dim2;
		System.out.println("Area of rectangle: "+ar);
	}
}
