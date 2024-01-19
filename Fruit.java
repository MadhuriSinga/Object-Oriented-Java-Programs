package week7;

public class Fruit {
	String name;
	String taste;
	String size;
	public Fruit(String name, String taste, String size) {
		super();
		this.name = name;
		this.taste = taste;
		this.size = size;
	}
	public void eat() {
		System.out.println("A "+name+" tastes "+".");
	}
}
