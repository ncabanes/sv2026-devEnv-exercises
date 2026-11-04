// CARLOS SANTOS DURÁ
import java.util.Scanner;

public class CarlosS {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number of rows: ");
		int rows = sc.nextInt();
		
		System.out.print("Enter a number of columns: ");
		int columns = sc.nextInt();
		
		for (int row=1; row<=rows;row++)
		{
			for (int column=1; column<=columns; column++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
