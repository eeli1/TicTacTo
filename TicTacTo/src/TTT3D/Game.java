package TTT3D;


import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		char EMPTY_FIELD = '.';
		char[] Players = { 'X', 'O' };
		char[][][] playground = Helper.initPlayground(EMPTY_FIELD);
		Helper.printPlayground(playground);

		int[] coordinates = new int[3];
		boolean ifTaken = false;
		boolean won = false;
		Scanner scanner = new Scanner(System.in);

		while ((!won)&&(!Helper.full(playground, EMPTY_FIELD))) {
			for (int i = 0; i < Players.length; i++) {

				System.out.println("Player: " + Players[i]);
				do {

					coordinates = Helper.getUserInput(scanner);

					ifTaken = !Helper.chekInput(playground, EMPTY_FIELD, coordinates);

					if (ifTaken) {
						System.out.println("this field is already been taken please choose another field");
						Helper.printPlayground(playground);
					}

				} while (ifTaken);

				playground = Helper.setField(playground, Players[i], coordinates);
				Helper.printPlayground(playground);

				won = Helper.checker(playground, Players[i]);
				if(won) {
					System.out.println("Player: " + Players[i] + " has won");
					break;
				}
				//System.out.println(won);
			}
		}

		System.out.println("finished");
		scanner.close();

	}
}
