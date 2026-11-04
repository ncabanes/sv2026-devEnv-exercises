import java.util.Scanner;

public class Alicia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows, columns;
        System.out.print("Tell me how many rows: ");
        rows = sc.nextInt();
        System.out.print("Tell me how many columns: ");
        columns = sc.nextInt();

        for(int n=1; n<=columns;n++)
        {
			for (int i = 1; i <=rows; i++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
			
		}
    }
}

