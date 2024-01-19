package week1;
import java.util.Scanner;
public class SimpleInterest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	      int principle,time,rateOfInterest;
	      float simpleInterest;
	      System.out.println("Enter principle,time and rate of interest:");
	      principle=sc.nextInt();
	      time=sc.nextInt();
	      rateOfInterest=sc.nextInt();
	      simpleInterest=(principle*time*rateOfInterest)/100;
	      System.out.println("Simple Interest: "+simpleInterest);

	}

}