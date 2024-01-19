package week6;

public class Book extends Author {
	public Book(String name,String email,char gender) {
		super(name,email,gender);
	}
	String b_name;
	double price;
	int stock;
	public String getB_name() {
		return b_name;
	}
	public void setB_name(String b_name ) {
		this.b_name=b_name;;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public static void main(String[] args) {
		Book b1=new Book("Abdul Kalam","kalam@gmail.com",'M');
		b1.setB_name("The Wings Of Fire");
		b1.setPrice(1000);
		b1.setStock(82);
		System.out.println("BOOK DETAILS");
		System.out.println("Name of the Book: "+b1.getB_name());
		System.out.println("Author name: "+b1.name);
		System.out.println("E-mail of Author: "+b1.email);
		System.out.println("Book price: "+b1.getPrice());
		System.out.println("In stock: "+b1.getStock());
	}
}
