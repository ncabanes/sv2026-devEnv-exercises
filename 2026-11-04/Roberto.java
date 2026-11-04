//Roberto Leal Carrizo 1 DAW 04/11
import java.util.Scanner;
public class Roberto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int rows, columns;
		System.out.print("Rows: ");
		rows=sc.nextInt();
		
		System.out.print("Columns: ");
		columns=sc.nextInt();

		for(int i=1; i<=rows; i++) {
			for(int c=1; c<=columns; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
