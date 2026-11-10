//RECTANGLE

import java.util.Scanner;

public class Diego {
		
	public static void main(String[] args) {
		
		int rows;
		int columns; 
			
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the rows: ");
		rows = scanner.nextInt();
		
		System.out.print("Enter the columns: ");
		columns = scanner.nextInt();
		
		for (int row = 1 ; row <= rows ; row++ ) 
		{
			for (int column = 1 ; column <= columns ; column++ ) 
			{
				System.out.print("*");
			}	
			System.out.println();					
		}
				
	}
}
