package TTT3D;

import java.util.Scanner;

public class Helper {

	public static boolean checker(char[][][] playground, char Player) {
		// Top
		for (int dim = 0; dim < playground.length; dim++) {
			for (int row = 0; row < playground.length; row++) {
				// rows
				if ((playground[0][row][dim] == Player) && (playground[1][row][dim] == Player)
						&& (playground[2][row][dim] == Player)) {
					return true;
				}
				// coloms
				if ((playground[dim][row][0] == Player) && (playground[dim][row][1] == Player)
						&& (playground[dim][row][2] == Player)) {
					return true;
				}
			}
			// diagonals
			if ((playground[0][dim][0] == Player) && (playground[1][dim][1] == Player)
					&& (playground[2][dim][2] == Player)) {
				return true;
			}
			if ((playground[0][dim][2] == Player) && (playground[1][dim][1] == Player)
					&& (playground[2][dim][0] == Player)) {
				return true;
			}
		}

		// side
		for (int dim = 0; dim < playground.length; dim++) {
			for (int row = 0; row < playground.length; row++) {
				// coloms
				if ((playground[row][0][dim] == Player) && (playground[row][1][dim] == Player)
						&& (playground[row][2][dim] == Player)) {
					return true;
				}
			}
			// diagonals
			if ((playground[dim][0][0] == Player) && (playground[dim][1][1] == Player)
					&& (playground[dim][2][2] == Player)) {
				return true;
			}
			if ((playground[dim][0][2] == Player) && (playground[dim][1][1] == Player)
					&& (playground[dim][2][0] == Player)) {
				return true;
			}
			if ((playground[0][0][dim] == Player) && (playground[1][1][dim] == Player)
					&& (playground[2][2][dim] == Player)) {
				return true;
			}
			if ((playground[0][2][dim] == Player) && (playground[1][1][dim] == Player)
					&& (playground[2][0][dim] == Player)) {
				return true;
			}

		}

		// diagonal
		if ((playground[0][0][0] == Player) && (playground[1][1][1] == Player) && (playground[2][2][2] == Player)) {
			return true;
		}
		if ((playground[2][0][0] == Player) && (playground[1][1][1] == Player) && (playground[0][2][2] == Player)) {
			return true;
		}

		return false;
	}

	// initializ the Playground (set every feld to blank)
	public static char[][][] initPlayground(char EMPTY_FIELD) {
		char[][][] playground = new char[3][3][3];
		for (int x = 0; x < playground.length; x++) {
			for (int y = 0; y < playground[x].length; y++) {
				for (int z = 0; z < playground[x][y].length; z++) {
					playground[x][y][z] = EMPTY_FIELD;
				}
			}
		}
		return playground;
	}

	// prints the 3D Playground (in 2D)
	public static void printPlayground(char[][][] playground) {
		for (int i = 0; i < 3; i++) {
			System.out.print("      ");
			System.out.print(i);
			System.out.print("         ");
		}
		System.out.println();

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 13; j++) {
				System.out.print("_");
			}
			System.out.print("   ");
		}
		System.out.println();

		for (int x = 0; x < playground.length; x++) {
			for (int y = 0; y < playground[x].length; y++) {
				for (int z = 0; z < playground[x][y].length; z++) {
					System.out.print("| ");
					System.out.print(playground[x][y][z]);
					System.out.print(" ");
					if (z == playground[x][y].length - 1) {
						System.out.print("|");
					}
				}
				System.out.print(x);
				System.out.print("  ");
			}
			System.out.println();
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 13; j++) {
				System.out.print("‾");
			}
			System.out.print("   ");
		}
		System.out.println();

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("  ");
				System.out.print(j);
				System.out.print(" ");
			}
			System.out.print("    ");
		}
		System.out.println();
	}

	//
	public static char[][][] setField(char[][][] playground, char Player, int[] coordinates) {
		int x = coordinates[1];
		int y = coordinates[2];
		int z = coordinates[0];
		playground[x][y][z] = Player;

		return playground;
	}

	// cheks if input in valed (on blank feld)
	public static boolean chekInput(char[][][] playground, char EMPTY_FIELD, int[] coordinates) {
		int x = coordinates[0];
		int y = coordinates[1];
		int z = coordinates[2];
		char field = playground[x][y][z];

		return (field == EMPTY_FIELD);
	}

	// User input with protection (can only select number betwen 0-2 )
	public static int[] getUserInput(Scanner scanner) {
		int[] output = new int[3];
		int temp = -1;
		boolean flag = false;
		String[] type = { "field", "row", "column" };

		for (int i = 0; i < output.length; i++) {
			System.out.println("select a " + type[i] + " number: ");
			while (!((temp >= 0) && (temp <= 2))) {
				if (flag) {
					System.out.println("this field dosn't exist pleas try again: ");
				}
				temp = scanner.nextInt();
				flag = true;
			}

			flag = false;
			output[i] = temp;
			temp = -1;
		}

		temp = output[0];
		output[0] = output[2];
		output[2] = temp;

		return output;
	}

	public static boolean full(char playground[][][], char EMPTY_FIELD) {
		for (int x = 0; x < playground.length; x++) {
			for (int y = 0; y < playground[x].length; y++) {
				for (int z = 0; z < playground[x][z].length; z++) {
					if (playground[x][y][z] == EMPTY_FIELD) {
						return false;
					}
				}
			}
		}
		return true;
	}

}
