package week3;

import java.util.Scanner;

public class HollowFullPyramid {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,j;
		System.out.println("Enter number of rows: ");
		n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for( j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
				if(j==1 || j==i || i==n) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			System.out.println();
		}

	}

}
