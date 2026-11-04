// tuber1a

import java.util.Scanner;

public class Brian {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Rows number?: ");
		int rows = sc.nextInt();
		
		System.out.println("columns number?: ");
		int cols = sc.nextInt();
		
		for (int i = 1; i <= rows; i++)
		{
			
			for (int j = 1; j <= cols; j++ )
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}	
