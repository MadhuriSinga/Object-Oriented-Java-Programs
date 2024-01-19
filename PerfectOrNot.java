package week2;
import java.util.Scanner;
public class PerfectOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, n, sum = 0;
		System.out.println("Enter a number : ");
		n = sc.nextInt();
		for (i = 1; i < n; i++) {
			if(n%i==0)
			sum = sum + i;
		}
		if (sum == n)
			System.out.println("Given number is a Perfect Number. ");
		else
			System.out.println("Given number is not a Perfect number.");

	}

}