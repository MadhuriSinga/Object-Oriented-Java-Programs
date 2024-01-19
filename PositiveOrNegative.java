package week1;
import java.util.Scanner;
public class PositiveOrNegative {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int n;
	    System.out.println("Enter any number:");
	    n=sc.nextInt();
	    if(n>0)
	    System.out.println("The number is positive.\n");
	    else if(n<0)
	    System.out.println("The number is negative.\n");
	    else
	    System.out.println("The number is zero.\n");

	}

}