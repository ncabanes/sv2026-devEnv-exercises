import java.util.Scanner;

public class Agatha2 {

	public static void main(String[] args) {
	
		byte rows;
		byte columns;
		byte size;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("size: ");
		size = sc.nextByte();
		
		for (int row = 0; row < rows; row++)
		{
			for (int column = 0; column < columns; column++)
			{
				System.out.print("*");
			}
			System.out.println();
			cols++;
		}
	}
}
