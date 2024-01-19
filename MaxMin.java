package week4;

import java.util.Scanner;

public class MaxMin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,max,min;
		System.out.println("Enter number of elements: ");
		n=sc.nextInt();
		System.out.println("Enter all the elements:");
		int a[]=new int[n];
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		max=a[0];
		min=a[0];
		for(i=0;i<n;i++) {
			if(a[i]>max)
				max=a[i];
		}
		for(i=0;i<n;i++) {
			if(a[i]<min)
				min=a[i];
		}
		System.out.println("The maximum element is: "+max);
		System.out.println("The minimum element is: "+min);

	}

}
