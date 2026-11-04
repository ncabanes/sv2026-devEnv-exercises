// Joel Albert Díaz

import java.util.Scanner;

public class Joel2 {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int rows, columns, size;
		
		System.out.print("Enter size: ");
		size = s.nextInt();
		rows = size;
		columns = size;
		
		for(int column = 1; column <= columns; column++)
		{
			for(int row = 1; row <= rows; row++)
			{
				System.out.print("*");
			}
			System.out.println();
			rows --;
		}
	}
}
