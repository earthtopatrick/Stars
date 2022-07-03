import java.util.Scanner;

/* This program generates various patterns of stars based on the shape and number of lines
   selected by the user. 
   
   Author: Patrick Harju
   Date: 11/14/2021
*/

public class Stars {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		System.out.println(
				"Please enter the shape you would like to create (Square, right angle triangle, flipped right angle triangle, or diamond): ");
		String response = scnr.nextLine();

		/* Square */
		if (response.equalsIgnoreCase("Square")) {

			System.out.println("Enter number of lines: ");

			int numLines = scnr.nextInt();

			for (int i = 1; i <= numLines; i++) {
				for (int j = 1; j <= numLines; j++) {
					System.out.print("**");
				}
				System.out.print("\n");
			}
			System.out.println("What a great looking square!");
		}

		/* Right Angle Triangle */
		else if (response.equalsIgnoreCase("Right angle triangle")) {

			System.out.println("Enter number of lines: ");

			int numLines = scnr.nextInt();

			for (int i = 1; i <= numLines; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print("* ");
				}
				System.out.println("");
			}
			System.out.println("Nice triangle!");
		}

		/* Flipped Right Angle Triangle */
		else if (response.equalsIgnoreCase("Flipped right angle triangle")) {

			System.out.println("Enter number of lines: ");

			int numLines = scnr.nextInt();

			for (int i = numLines; i > 0; i--) {
				for (int j = i; j > 0; j--) {
					System.out.print("* ");
				}
				System.out.print("\n");
			}

		}

		/* Diamond */
		else if (response.equalsIgnoreCase("Diamond")) {

			System.out.println("Enter number of lines: ");

			int numLines = scnr.nextInt();

			for (int i = 1; i <= numLines; i++) {
				for (int j = i; j < numLines; j++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= (2 * i - 1); j++) {
					System.out.print("*");
				}
				System.out.println("");
			}
			for (int i = numLines; i >= 1; i--) {
				for (int j = i; j <= numLines; j++) {
					System.out.print(" ");
				}
				for (int j = 2; j < (2 * i - 1); j++) {
					System.out.print("*");
				}
				System.out.println("");
			}
		}

	}

}
