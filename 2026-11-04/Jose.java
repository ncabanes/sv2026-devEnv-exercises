//Jose García Martínez

import java.util.Scanner;
public class Jose{
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		int row,columns;
		
		System.out.print("rows:");
		row = sc.nextInt();
		
		System.out.print("Columns:");
		columns = sc.nextInt();
		
		for(int i=1; i <= row; i++)
		{
			for(int j=1 ; j <= columns; j++)
			{
			System.out.print("*");
			}
			System.out.println();
		}
	}
}
