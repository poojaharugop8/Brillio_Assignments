package Assignments;

public class Task3 {

	public static void main(String[] args) {

		for (int i = 0; i < 15; i++) {     //rows 15
			for (int j = 0; j < 46; j++) {   // column 46  =  34(=) and 12(*)
				if (i < 9 && j < 12) {
					if ((i + j) % 2 == 0 && j != 11) {
						System.out.print("*");  // odd spaces
					} else {
						System.out.print(" ");  // even spaces
					}
				} else {
					System.out.print("=");   //
				}
			}
			System.out.println();
		}

	}

}
