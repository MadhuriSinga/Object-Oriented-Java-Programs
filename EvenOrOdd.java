package week2;
import java.util.Scanner;
public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner sc=new  Scanner(System.in);
		int n;
		System.out.print("Enter a number : ");
		n=sc.nextInt();
		if(n%2==0)
		System.out.println("This is a Even number.");
		else
		System.out.println("This is a Odd number.");

	}

}