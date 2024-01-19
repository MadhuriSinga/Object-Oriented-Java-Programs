package week4;

import java.util.Scanner;

public class Gcd {
	public static int gcd(int a,int b) {
		if(b==0) {
			return a;
		} else {
				return gcd(b,a%b);
		  }
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.println("Enter any two numbers: ");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("GCD of "+a+" and "+b+" is: "+gcd(a,b));
	}

}
