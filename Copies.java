package week5;

import java.util.Scanner;

public class Copies {

	public static void main(String[] args) {
		String s1,s2;
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string: ");
		s1=sc.nextLine();
		s2=s1.substring(0,2);
		for(i=0;i<s1.length();i++) {
			System.out.print(s2);
		}
	}

}
