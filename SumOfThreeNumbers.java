package week1;
import java.util.Scanner;
public class SumOfThreeNumbers{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c,sum;
		System.out.println("Enter any three numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		sum=a+b+c;
		System.out.println("Sum of "+a+", "+b+" and "+c+"is: "+sum);
	}
	
}