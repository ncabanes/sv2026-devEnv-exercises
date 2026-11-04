// tuber1a

import java.util.Scanner;

public class Brian {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero para el largo: ");
		int largo = sc.nextInt();
		
		System.out.println("Introduce un numero para saber el ancho");
		int ancho = sc.nextInt();
		
		for (int i = 1; i <= largo; i++)
		{
			
			for (int j = 1; j <= ancho; j++ )
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}	