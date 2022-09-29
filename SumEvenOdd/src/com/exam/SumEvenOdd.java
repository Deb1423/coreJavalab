package com.exam;

import java.util.Scanner;

public class SumEvenOdd {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The  Size of the  number:");
		int size = sc.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter the number of the array:");
		int i, oddSum = 0, evenSum = 0;
		for (i = 0; i < size; i++)
			arr[i] = sc.nextInt();
		for (i = 0; i < size; i++)
			if (arr[i] % 2 == 0)
				evenSum = evenSum + arr[i];
			else
				oddSum = oddSum + arr[i];
		System.out.println("Sum of the even Numbers :" + evenSum);
		System.out.println("Sum of the odd Numbers :" + oddSum);
	}

}
