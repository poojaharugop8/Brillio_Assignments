package Assignments;

import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String:");
		String str = sc.next();
		
		System.out.println("Enter the char to be replaced:");
		char charToReplace = sc.next().charAt(0);
		System.out.println("Enter the char to be replaced with:");
		char charToReplaceWith = sc.next().charAt(0);
		
		String replaced = str.replace(charToReplace, charToReplaceWith);
		
		System.out.println("Replaced String:" + replaced);
	}
}
