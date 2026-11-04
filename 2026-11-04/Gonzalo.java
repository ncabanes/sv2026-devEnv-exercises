import java.util.Scanner;
public class Gonzalo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many rows? ");
		int rows = sc.nextInt();
		System.out.print("How many columns? ");
		int columns = sc.nextInt();
		for(int idRows = 1; idRows <= rows; idRows++) {
			for(int idColumns = 1; idColumns <= columns; idColumns++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
