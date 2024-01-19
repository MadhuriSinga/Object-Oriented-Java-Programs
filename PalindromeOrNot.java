package week2;
import java.util.Scanner;
public class PalindromeOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, r, m = 0;
		System.out.println("Enter a number : ");
		n = sc.nextInt();
		int s = n;
		while (n > 0) {
			r = n % 10;
			m = (m * 10) + r;
			n = n / 10;
		}
		if (s == m)
			System.out.println("Given number is a Palindrome Number. ");
		else
			System.out.println("Given number is not a Palindrome number.");

	}

}
