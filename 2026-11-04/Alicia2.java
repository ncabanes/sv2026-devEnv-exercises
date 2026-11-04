//Alicia Linares
import java.util.Scanner;

public class Alicia2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.print("Tell me the size: ");
        size = sc.nextInt();
       

        for(int n=size; n>=1;n--)
        {
			for (int i=n; i>=1;i--)
			{
				System.out.print("*");
			}
			System.out.println( );
			
		}
		
    }
}
