package week7;

public class Orange extends Fruit {
	public Orange(String name,String size) {
		super(name,"citrus",size);
	}
	public void eat() {
		System.out.println("An "+name+" tastes "+taste+" and is juicy.");
	}
}
