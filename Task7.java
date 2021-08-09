package Assignments;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Size of the array:");
		int m = sc.nextInt();
		int[][] arr = new int[m][m];
		// int[][] newArr = new int[m][m];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < m; j++) {
				int a = sc.nextInt();
				arr[i][j] = a;
			}
		}
		System.out.println("Old array :");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
		}

		System.out.println("New array :");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(arr[j][i] + "  ");
			}
			System.out.println();
		}
	}
}
