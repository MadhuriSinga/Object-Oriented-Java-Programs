package week5;

import java.util.Scanner;

public class ReturnIfEven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String input=sc.next();
		String result=getFirstHalf(input);
		System.out.println(result);
	}
	public static String getFirstHalf(String input) {
		if(input.length()%2==0) {
			return input.substring(0,input.length()/2);
		} else {
			return null;
		}
	}

}
