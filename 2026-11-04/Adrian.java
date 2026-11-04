// Rectangle

import java.util.Scanner;
public class EjercicioRectangulo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int width, height;
		
		System.out.print("Write the width of the rectangle: ");
		width=sc.nextInt();
		System.out.print("Write the height of the rectangle: ");
		height=sc.nextInt();
		
		for(int row=1;row<=width;row++)
		{
			for(int columns=1;columns<=height;columns++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
