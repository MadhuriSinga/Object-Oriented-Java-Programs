package week2;
import java.util.Scanner;
public class PrimeOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int num,i,count=0;
	    System.out.println("Enter any number:");
	    num=sc.nextInt();
	    for(i=2;i<num;i++)
	    {
	      if(num%i==0)
	      {
	        count++;
	        break; 
	      }
	    }
	    if(count==0)
	    System.out.println("It is a Prime number.\n");
	   else 
	   System.out.println("It is not a Prime number.\n");

	}

}
