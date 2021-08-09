package Assignments;

import java.util.Scanner;

/***
 * endswith the given str
 * @author Pooja.Harugop
 *
 */
public class Task6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the str:");
		String str = sc.next();
		String end = sc.next();
		
		boolean check = str.endsWith(end);
		
		if(check==true)	
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
