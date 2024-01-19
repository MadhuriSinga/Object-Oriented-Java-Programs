package week3;

import java.util.Scanner;

public class InvertedFullPyramid {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter number of rows: ");
		n=sc.nextInt();
		for(int i=n;i>=1;i--) {
			for( int k=1;k<=n-i;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
