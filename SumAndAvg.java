package week4;

import java.util.Scanner;

public class SumAndAvg {

	public static void main(String[] args) {
		int i,sum=0;
		float average;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		int n=sc.nextInt();
		System.out.println("Enter all the elements: ");
		int a[]=new int[n];
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();
			sum+=a[i];
		}
		System.out.println("Sum is: "+sum);
		average=(float)sum/n;
		System.out.println("Average is: "+average);

	}

}
