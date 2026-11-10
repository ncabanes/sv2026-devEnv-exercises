//rectangulo2
import java.util.Scanner;
public class Rectangulo2 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int size, rows, columns;
        
        System.out.print("Size? ");
        size=sc.nextInt();
        rows=size;
        columns=size;
        
        for(int row = 0; row<rows; row++)
        {
			for(int column=0; column<columns; column++)
			{
				System.out.print("*");
			}
			System.out.println();
			columns--;
		}
	}
}
