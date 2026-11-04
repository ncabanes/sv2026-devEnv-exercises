// Joel Albert Díaz

import java.util.Scanner;

public class Joel {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int rows, columns;
		
		System.out.print("Enter rows: ");
		rows = s.nextInt();
		
		System.out.print("Enter columns: ");
		columns = s.nextInt();
		
		for(int column = 1; column <= columns; column ++)
		{
			for(int row = 1; row <= rows; row ++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
