//Alicia Linares
import java.util.Scanner;
import java.util.Random;

public class Alicia{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rndm = new Random();
		int number;
		int random = rndm.nextInt(100); 
		do{
			System.out.print("Insert a number: ");
			number=sc.nextInt();
			if(number!=random)
			{
				System.out.print("Incorrect number. ");
				if(number>random)
				{
					System.out.println("The correct number is smaller");
				}
				else
				{
					System.out.println("The correct number is bigger");
				}
			}
		}while(number!=random);
		System.out.println("Correct number!");
		
    }
}

