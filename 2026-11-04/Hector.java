//Héctor Cabrera Martinez
import java.util.Scanner;
public class Hector{
	public static void main (String [] args){
		int rows, columns;
			Scanner sc = new Scanner (System.in);
			System.out.print("insert the number of rows ");
				rows= sc.nextInt();
			System.out.print("insert the number of hight ");
				columns= sc.nextInt();
				for (int row=0; row<rows; row++)
				{
					for(int column=0; column<columns; column++)
					{
						System.out.print("*");
					}
					System.out.println("");
				}
	}
}
