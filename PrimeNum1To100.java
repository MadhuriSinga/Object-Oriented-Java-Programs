package week2;
import java.util.Scanner;
public class PrimeNum1To100 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=100,count;
		System.out.println("Prime numbers between 1 to 100 is:");
        for(int j=2;j<=n;j++)
        {
        	count=0;
        	for(int i=1;i<=n;i++)
        	{
        		if(j%i==0)
        		{
        			count++;
        		}
        	}
        	if(count==2)
        		System.out.print(j+" ");
		}

	}

}
