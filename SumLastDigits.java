package week4;

import java.util.Scanner;

public class SumLastDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1,num2,sum;
		System.out.println("Enter first number: ");
		num1=sc.nextInt();
		System.out.println("Enter second number: ");
		num2=sc.nextInt();
		int LastDigit1=num1%10;
		int LastDigit2=num2%10;
		sum=LastDigit1+LastDigit2;
		System.out.println("Sum of last digits is: "+sum);

	}

}
