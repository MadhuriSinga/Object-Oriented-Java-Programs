package week2;
import java.util.Scanner;
public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,a=0,b=0,c=1;
		System.out.println("Enter a number : ");
		n=sc.nextInt();
		System.out.println("Fibonacci terms till "+n+" is ");
		for(i=1;i<=n;i++)
		{
		a=b;
		b=c;
		c=a+b;
		System.out.print(a+" ");
}
	}

}