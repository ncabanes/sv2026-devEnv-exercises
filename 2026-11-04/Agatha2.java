import java.util.Scanner;

public class Agatha {

	public static void main(String[] args) {
	
		byte rows;
		byte cols;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Rows number?: ");
		rows = sc.nextByte();
		
		System.out.println("Colummns number?: ");
		cols = sc.nextByte();
		
		for (int i = 0; i < rows; i++)
		{
			for (int j = 0; j < cols; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
