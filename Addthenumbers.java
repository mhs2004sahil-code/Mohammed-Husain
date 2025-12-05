package program1array;

import java.util.*;

public class Addthenumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
		 * System.out.println("Enter the number1 you want to add"); int number1 =
		 * scan.nextInt(); System.out.println("Enter the number2 you wnat to add"); int
		 * number2 = scan.nextInt();
		 * System.out.println("Enter the number3 you want to add"); int number3 =
		 * scan.nextInt(); System.out.println("Enter the number4 you want to add"); int
		 * number4 = scan.nextInt(); int sum = number1 + number2 + number3 + number4;
		 * System.out.println("The sum of the four number is " + sum);
		 */
		System.out.println("Enter the first match score");
		int score = scan.nextInt();
		System.out.println("Enter the Secound match score");
		int score1 = scan.nextInt();
		if (score > score1) {
			System.out.println("The first match is win  with the score of " + score);
		} else if (score < score1) {
			System.out.println("The scound match is win  with the score of " + score1);
		} else if (score == score1) {
			System.out.println("The match is Tie both of the  team  are scored same   " + score);
		} else {
			System.out.println("You entered  the invalid marks ");

		}

	}

}
