package Assignments;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] bin = new int[32];
		System.out.println("Enter the decimal number: ");
		int num = sc.nextInt();
		int in=0;
		for(int i=0; num>0 ; i++)
		{
			int rem = num % 2;
			bin[in++] = rem;
			num = num / 2;
		}
		
		for (int j = in-1; j >= 0; j--) {
			System.out.print(bin[j]);
		}
//		String bin = Integer.toBinaryString(num);
//	    System.out.println(bin);

			
	}
}
