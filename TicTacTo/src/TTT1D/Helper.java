package TTT1D;

import java.util.Scanner;

public class Helper {
	
	public static char[] initPlayground(char EMPTY_FIELD, int size) {
		char[] playground = new char[size];
		for (int i = 0; i < playground.length; i++) {
			playground[i] = EMPTY_FIELD;
		}
		return playground;
	}

	public static boolean chekInput(char[] playground, char EMPTY_FIELD, int coordinates) {
		return (playground[coordinates] == EMPTY_FIELD);
	}

	public static char[] setField(char[] playground, char player, int coordinates) {
		playground[coordinates] = player;
		return playground;
	}

	public static int getUserInput(Scanner scanner, int size) {
		int output = -1;
		boolean flag = false;

		System.out.println("choose a field");
		do {
			if (flag) {
				System.out.println("this field dosn't exist pleas try again: ");
			}
			output = scanner.nextInt();
			flag = true;
		} while (!((output >= 0) && (output <= size - 1)));

		return output;
	}

	public static boolean checker(char[] playground, char Player) {
		int count = 0;
		for (int i = 0; i < playground.length; i++) {
			if (playground[i] == Player) {
				count++;
			} else {
				count = 0;
			}
			if (count >= 3) {

				return true;
			}
		}
		return false;
	}

	public static boolean full(char playground[], char EMPTY_FIELD) {
		for (int i = 0; i < playground.length; i++) {
			if(playground[i] == EMPTY_FIELD) {
				return false;
			}
		}
		return true;
	}

	public static void printPlayground(char[] playground) {
		for (int i = 0; i < playground.length; i++) {
			System.out.print("| ");
			System.out.print(playground[i]);
			System.out.print(" ");
		}
		System.out.print("|");
		System.out.println();

		for (int i = 0; i < playground.length; i++) {
			System.out.print("  ");
			System.out.print(i);
			System.out.print(" ");

		}
		System.out.println();
	}
}
