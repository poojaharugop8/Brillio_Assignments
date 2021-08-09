package Assignments;

import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Base Number:");
		int base = sc.nextInt();
		System.out.println("Enter the exponent Number:");
		int exponent = sc.nextInt();
		
	    double result = Math.pow(base, exponent);

	    System.out.println("Answer = " + result);
	}
}
