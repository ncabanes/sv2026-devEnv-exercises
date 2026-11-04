//Héctor Cabrera Martinez
import java.util.Scanner;
public class Hector2{
	public static void main (String [] args){
		int size;
			Scanner sc = new Scanner (System.in);
			System.out.print("insert the size of the triancle ");
				size= sc.nextInt();
			
				for (int row=size; row>0; row--)
				{
					for(int column=0; column<row; column++)
					{
						System.out.print("*");
					}
					System.out.println("");
				}
	}
}
