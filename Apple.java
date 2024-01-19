package week7;

public class Apple extends Fruit {
	public Apple(String name,String size) {
		super(name,"sweet",size);
	}
	public void eat() {
		System.out.println("An "+name+" tastes "+taste+" and is cruchy.");
	}
}
