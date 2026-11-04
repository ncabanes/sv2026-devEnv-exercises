import java.util.Scanner;

public class Agatha2 {

	public static void main(String[] args) {
	
		byte rows;
		byte cols;
		byte spaces;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Rows number?: ");
		rows = sc.nextByte();
		
		System.out.println("Colummns number?: ");
		cols = sc.nextByte();
		
		for (int row = 0; row < rows; row++)
		{
			for (int col = 0; col < rows; col++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
