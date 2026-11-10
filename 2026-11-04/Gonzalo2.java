// Gonzalo Martínez Díaz
import java.util.Scanner;
public class Gonzalo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Size? ");
		int size = sc.nextInt();
		int rows = size;
		int columns = size;
		for(int idRows = 1; idRows <= rows; idRows++) {
			for(int idColumns = 1; idColumns <= columns; idColumns++) {
				System.out.print("*");
			}
			System.out.println();
			columns--;
		}
	}
}
