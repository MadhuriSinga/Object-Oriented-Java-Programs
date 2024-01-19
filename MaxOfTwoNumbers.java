package week1;
import java.util.Scanner;
public class MaxOfTwoNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		  int num1,num2,max;
		  System.out.println("Enter any two numbers:");
		  num1=sc.nextInt();
		  num2=sc.nextInt();
		  max=num1>num2?num1:num2;
		  System.out.println("Maximum number is:"+max);
	}

}