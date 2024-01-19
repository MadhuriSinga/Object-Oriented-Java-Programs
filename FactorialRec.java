package week4;

import java.util.Scanner;

public class FactorialRec {
	public static int fact(int a) {
		if(a==0) {
			return 1;
		}else {
			return a*fact(a-1);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a;
		System.out.println("Enter any number: ");
		a=sc.nextInt();
		System.out.println("Factorial is: "+fact(a));

	}

}
