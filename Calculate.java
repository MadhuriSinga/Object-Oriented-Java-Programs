package week9;
import java.util.Scanner;
import arithmetic.ArithmeticOperations;
public class Calculate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArithmeticOperations s=new ArithmeticOperations();
		int a,b;
		System.out.println("Enter any two numbers: ");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Addition = "+s.addition(a,b)+'\n'+"Subtraction = "+s.subtraction(a,b)+'\n'+"Multiplication = "+s.multiplication(a,b)+'\n'+"Division = "+s.division(a,b));
	}
}
