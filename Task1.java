package Assignments;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		float num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Two numbers:");
		num1 = sc.nextFloat();
		num2 = sc.nextFloat();
		
		float div = num1/num2;
		System.out.println("Division =  "+ div);
	}

}
