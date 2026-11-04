//Héctor Cabrera Martinez
import java.util.Scanner;
public class Hector{
	public static void main (String [] args){
		int rows, hight;
			Scanner sc = new Scanner (System.in);
			System.out.print("insert the number of rows ");
				rows= sc.nextInt();
			System.out.print("insert the number of hight ");
				hight= sc.nextInt();
				for (int column=0; column<hight; column++)
				{
					for(int i=0; i<rows; i++)
					{
						System.out.print("*");
					}
					System.out.println("");
				}
	}
}
