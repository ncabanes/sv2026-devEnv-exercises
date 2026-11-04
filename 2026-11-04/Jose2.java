//Jose García Martínez

import java.util.Scanner;
public class Jose2{
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		
		int height;
		
		System.out.print("Height:");
		height = sc.nextInt();
		
		for(int i=1; i<= height; i++)
		{
			for(int j=1; j<=height -i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
