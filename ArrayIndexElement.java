package week8;

import java.util.Scanner;

public class ArrayIndexElement {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Enter the size of the array: ");
			int size = input.nextInt();

			int[] array = new int[size];

			System.out.println("Enter the elements of the array:");
			for (int i = 0; i < size; i++) {
				array[i] = input.nextInt();
			}

			try {
				System.out.print("Enter the index: ");
				int index = input.nextInt();

				int element = array[index];

				System.out.println("Element at index " + index + ": " + element);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Invalid index! Index should be between 0 and " + (size - 1));
			} catch (NumberFormatException e) {
				System.out.println("Invalid input! Please enter a valid integer for index.");
			}
		}

	}

}