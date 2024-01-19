package week4;

import java.util.Scanner;

public class ArrSortOrder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size=sc.nextInt();
		int[] array=new int[size];
		System.out.println("Enter the array elements: ");
		for(int i=0;i<size;i++) {
			array[i]=sc.nextInt();
		}
		bubbleSort(array);
		System.out.println("Sorted array: ");
		for(int num : array) {
			System.out.print(num+" ");
		}

	}
	private static void bubbleSort(int[] array) {
		int n=array.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(array[j]>array[j+1]) {
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
	}

}
