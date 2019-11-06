package TTT2D;

import java.util.Scanner;

public class Helper {
	public static char[][] initPlayground(char EMPTY_FIELD) {
		char[][] playground = new char[3][3];

		for (int x = 0; x < playground.length; x++) {
			for (int y = 0; y < playground[x].length; y++) {
				playground[x][y] = EMPTY_FIELD;
			}
		}

		return playground;
	}

	public static boolean chekInput(char[][] playground, char EMPTY_FIELD, int[] coordinates) {
		int x = coordinates[0];
		int y = coordinates[1];

		return (playground[x][y] == EMPTY_FIELD);
	}

	public static char[][] setField(char[][] playground, char player, int[] coordinates) {
		int x = coordinates[0];
		int y = coordinates[1];

		playground[x][y] = player;
		return playground;
	}

	public static int[] getUserInput(Scanner scanner) {

		int[] output = new int[2];
		int temp = -1;
		boolean flag = false;
		String[] type = { "row", "column" };

		for (int i = 0; i < output.length; i++) {
			System.out.println("select a " + type[i] + " number: ");
			do {
				if (flag) {
					System.out.println("this field dosn't exist pleas try again: ");
				}
				temp = scanner.nextInt();
				flag = true;
			} while (!((temp >= 0) && (temp <= 2)));

			flag = false;
			output[i] = temp;
			temp = -1;
		}

		return output;
	}

	public static boolean checker(char[][] playground, char Player) {
		for (int i = 0; i < playground.length; i++) {
			// rows
			if ((playground[0][i] == Player) && (playground[1][i] == Player) && (playground[2][i] == Player)) {
				return true;
			}
			// coloms
			if ((playground[i][0] == Player) && (playground[i][1] == Player) && (playground[i][2] == Player)) {
				return true;
			}
		}
		// diagonals
		if ((playground[0][0] == Player) && (playground[1][1] == Player) && (playground[2][2] == Player)) {
			return true;
		}
		if ((playground[0][2] == Player) && (playground[1][1] == Player) && (playground[2][0] == Player)) {
			return true;
		}
		return false;
	}

	public static void printPlayground(char[][] playground) {
		for (int i = 0; i < 13; i++) {
			System.out.print("_");
		}

		System.out.println();

		for (int x = 0; x < playground.length; x++) {
			for (int y = 0; y < playground[x].length; y++) {
				System.out.print("| ");
				System.out.print(playground[x][y]);
				System.out.print(" ");
				if (y == playground[x].length - 1) {
					System.out.print("|");
				}
			}
			System.out.print(x);
			System.out.println();
		}
		// System.out.println();

		for (int i = 0; i < 13; i++) {
			System.out.print("‾");
		}

		System.out.println();

		for (int i = 0; i < 3; i++) {
			System.out.print("  ");
			System.out.print(i);
			System.out.print(" ");
		}

		System.out.println();
	}

	public static boolean full(char playground[][], char EMPTY_FIELD) {
		for (int x = 0; x < playground.length; x++) {
			for (int y = 0; y < playground[x].length; y++) {
				if (playground[x][y] == EMPTY_FIELD) {
					return false;
				}
			}
		}
		return true;
	}

}
