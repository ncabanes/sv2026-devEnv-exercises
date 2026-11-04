// CARLOS SANTOS DURÁ
import java.util.Scanner;

public class CarlosS2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Size: ");
		int size = sc.nextInt();
		
		for (int row=size; row>=0;row--)
		{
			for (int column=0; column<row; column++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
