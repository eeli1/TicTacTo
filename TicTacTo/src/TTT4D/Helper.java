package TTT4D;

public class Helper {

	public static void main(String[] args) {
		// for Test
		char Player = 'X';
		char test1[][][][] = {
				{ { { 'X', '.', '.' }, { '.', '.', '.' }, { '.', '.', '.' } },
						{ { '.', '.', '.' }, { '.', '.', '.' }, { '.', '.', '.' } },
						{ { '.', '.', '.' }, { '.', '.', '.' }, { '.', '.', '.' } } },

				{ { { 'X', '.', '.' }, { '.', '.', '.' }, { '.', '.', '.' } },
						{ { '.', '.', '.' }, { '.', '.', '.' }, { '.', '.', '.' } },
						{ { '.', '.', '.' }, { '.', '.', '.' }, { '.', '.', '.' } } },

				{ { { 'X', '.', '.' }, { '.', '.', '.' }, { '.', '.', '.' } },
						{ { '.', '.', '.' }, { '.', '.', '.' }, { '.', '.', '.' } },
						{ { '.', '.', '.' }, { '.', '.', '.' }, { '.', '.', '.' } } } };

		char test2[][][][] = {
				{ { { 'X', '.', '.' }, { '.', '.', '.' }, { '.', '.', '.' } },
						{ { '.', '.', '.' }, { '.', '.', '.' }, { '.', '.', '.' } },
						{ { '.', '.', '.' }, { '.', '.', '.' }, { '.', '.', '.' } } },

				{ { { '.', '.', '.' }, { '.', '.', '.' }, { '.', '.', '.' } },
						{ { 'X', '.', '.' }, { '.', '.', '.' }, { '.', '.', '.' } },
						{ { '.', '.', '.' }, { '.', '.', '.' }, { '.', '.', '.' } } },

				{ { { '.', '.', '.' }, { '.', '.', '.' }, { '.', '.', '.' } },
						{ { '.', '.', '.' }, { '.', '.', '.' }, { '.', '.', '.' } },
						{ { 'X', '.', '.' }, { '.', '.', '.' }, { '.', '.', '.' } } } };

		char test3[][][][] = {
				{ { { 'X', '.', '.' }, { '.', '.', '.' }, { '.', '.', '.' } },
						{ { '.', '.', '.' }, { '.', '.', '.' }, { '.', '.', '.' } },
						{ { '.', '.', '.' }, { '.', '.', '.' }, { '.', '.', '.' } } },

				{ { { '.', '.', '.' }, { '.', '.', '.' }, { '.', '.', '.' } },
						{ { '.', '.', '.' }, { '.', 'X', '.' }, { '.', '.', '.' } },
						{ { '.', '.', '.' }, { '.', '.', '.' }, { '.', '.', '.' } } },

				{ { { '.', '.', '.' }, { '.', '.', '.' }, { '.', '.', '.' } },
						{ { '.', '.', '.' }, { '.', '.', '.' }, { '.', '.', '.' } },
						{ { '.', '.', '.' }, { '.', '.', '.' }, { '.', '.', 'X' } } } };

		char test4[][][][] = {
				{ { { 'X', '.', '.' }, { '.', '.', '.' }, { '.', '.', '.' } },
						{ { '.', '.', '.' }, { '.', '.', '.' }, { '.', '.', '.' } },
						{ { '.', '.', '.' }, { '.', '.', '.' }, { '.', '.', '.' } } },

				{ { { '.', '.', '.' }, { '.', '.', '.' }, { '.', '.', '.' } },
						{ { '.', '.', '.' }, { 'X', '.', '.' }, { '.', '.', '.' } },
						{ { '.', '.', '.' }, { '.', '.', '.' }, { '.', '.', '.' } } },

				{ { { '.', '.', '.' }, { '.', '.', '.' }, { '.', '.', '.' } },
						{ { '.', '.', '.' }, { '.', '.', '.' }, { 'X', '.', '.' } },
						{ { '.', '.', '.' }, { '.', '.', '.' }, { '.', '.', '.' } } } };

		char test5[][][][] = {
				{ { { 'X', '.', '.' }, { '.', '.', '.' }, { '.', '.', '.' } },
						{ { '.', '.', '.' }, { '.', '.', '.' }, { '.', '.', '.' } },
						{ { '.', '.', '.' }, { '.', '.', '.' }, { '.', '.', '.' } } },

				{ { { '.', '.', '.' }, { '.', 'X', '.' }, { '.', '.', '.' } },
						{ { '.', '.', '.' }, { '.', '.', '.' }, { '.', '.', '.' } },
						{ { '.', '.', '.' }, { '.', '.', '.' }, { '.', '.', '.' } } },

				{ { { '.', '.', '.' }, { '.', '.', '.' }, { '.', '.', 'X' } },
						{ { '.', '.', '.' }, { '.', '.', '.' }, { '.', '.', '.' } },
						{ { '.', '.', '.' }, { '.', '.', '.' }, { '.', '.', '.' } } } };

		char test7[][][][] = {
				{ { { '.', '.', 'X' }, { '.', '.', '.' }, { '.', '.', '.' } },
						{ { '.', '.', '.' }, { '.', '.', 'X' }, { '.', '.', '.' } },
						{ { '.', '.', '.' }, { '.', '.', '.' }, { '.', '.', 'X' } } },

				{ { { '.', '.', '.' }, { '.', '.', '.' }, { '.', '.', '.' } },
						{ { '.', '.', '.' }, { '.', '.', '.' }, { '.', '.', '.' } },
						{ { '.', '.', '.' }, { '.', '.', '.' }, { '.', '.', '.' } } },

				{ { { '.', '.', '.' }, { '.', '.', '.' }, { '.', '.', '.' } },
						{ { '.', '.', '.' }, { '.', '.', '.' }, { '.', '.', '.' } },
						{ { '.', '.', '.' }, { '.', '.', '.' }, { '.', '.', '.' } } } };

		printPlayground(test7);
		System.out.println(checker(test7, Player));

	}

	private static boolean checker(char[][][][] playground, char Player) {
		// Top 2D
		for (int i = 0; i < playground.length; i++) {
			for (int dim = 0; dim < playground[i].length; dim++) {
				for (int row = 0; row < playground[i][dim].length; row++) {
					// rows
					if ((playground[dim][i][row][0] == Player) && (playground[dim][i][row][1] == Player)
							&& (playground[dim][i][row][2] == Player)) {
						return true;
					}
					// coloms
					if ((playground[dim][row][0][i] == Player) && (playground[dim][row][1][i] == Player)
							&& (playground[dim][row][2][i] == Player)) {
						return true;
					}
				}
				// diagonals
				if ((playground[i][0][dim][0] == Player) && (playground[i][1][dim][1] == Player)
						&& (playground[i][2][dim][2] == Player)) {
					return true;
				}
				if ((playground[i][2][dim][0] == Player) && (playground[i][1][dim][1] == Player)
						&& (playground[i][0][dim][2] == Player)) {
					return true;
				}
			}
		}

		// side 3D
		for (int i = 0; i < playground.length; i++) {
			for (int dim = 0; dim < playground.length; dim++) {
				for (int row = 0; row < playground.length; row++) {
					// coloms
					if ((playground[row][0][dim][i] == Player) && (playground[row][1][dim][i] == Player)
							&& (playground[row][2][dim][i] == Player)) {
						return true;
					}
				}
				// diagonals
				if ((playground[i][dim][0][0] == Player) && (playground[i][dim][1][1] == Player)
						&& (playground[i][dim][2][2] == Player)) {
					return true;
				}
				if ((playground[i][dim][2][0] == Player) && (playground[i][1][1][1] == Player)
						&& (playground[i][dim][0][2] == Player)) {
					return true;
				}
				if ((playground[dim][i][0][0] == Player) && (playground[dim][i][1][1] == Player)
						&& (playground[dim][i][2][2] == Player)) {
					return true;
				}
				if ((playground[2][i][dim][0] == Player) && (playground[1][i][dim][1] == Player)
						&& (playground[0][i][dim][2] == Player)) {
					return true;
				}

			}

			// diagonal
			if ((playground[i][0][0][0] == Player) && (playground[i][1][1][1] == Player)
					&& (playground[i][2][2][2] == Player)) {
				return true;
			}
			if ((playground[i][2][0][0] == Player) && (playground[i][1][1][1] == Player)
					&& (playground[i][0][2][2] == Player)) {
				return true;
			}
		}

		// imaginary space 4D

		return false;
	}

	private static void printPlayground(char[][][][] playground) {
		for (int k = 0; k < playground.length; k++) {
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
						System.out.print(playground[k][x][y][z]);
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
			for (int i = 0; i < 48; i++) {
				System.out.print('-');
			}

			System.out.println();
		}
	}
}