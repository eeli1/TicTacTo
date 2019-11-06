package TTT2D;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		char EMPTY_FIELD = '.';
		char[] Players = { 'X', 'O' };
		Scanner scanner = new Scanner(System.in);

		char[][] playground = Helper.initPlayground(EMPTY_FIELD);
		Helper.printPlayground(playground);

		boolean won = false;
		boolean ifTaken = false;
		int[] coordinates;

		while ((!won) && (!Helper.full(playground, EMPTY_FIELD))) {
			for (int i = 0; i < Players.length; i++) {

				do {
					System.out.print("Player: " + Players[i] + " ");
					coordinates = Helper.getUserInput(scanner);
					ifTaken = !Helper.chekInput(playground, EMPTY_FIELD, coordinates);

					if (ifTaken) {
						System.out.println("this field is already been taken please choose another field");
					}

				} while (ifTaken);
				playground = Helper.setField(playground, Players[i], coordinates);
				Helper.printPlayground(playground);

				won = Helper.checker(playground, Players[i]);

				if (won) {
					System.out.println("Player: " + Players[i] + " has won");
					break;
				}
				if(Helper.full(playground, EMPTY_FIELD)) {
					System.out.println("Tie");
					break;
				}
			}
		}

		System.out.println("finished");
		scanner.close();
	}
}