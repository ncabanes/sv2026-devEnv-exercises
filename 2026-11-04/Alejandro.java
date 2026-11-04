// Alejandro Galvañ Gomis

import java.util.Scanner;
public class Alejandro {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int rows, columns;
		
		System.out.print("Rows: ");
		rows = s.nextInt();
		System.out.print("Columns: ");
		columns = s.nextInt();
		
		for (int y = 1; y <= rows; y++) {
			for (int x = 1; x <= columns; x++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
