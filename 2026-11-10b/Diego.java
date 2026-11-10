//Random Number (1-100)
import java.util.Scanner;

public class Diego 
	{
		
	public static void main(String[] args) 
	
	{
		int number = 0;
		int hidden = 54;
		Scanner scanner = new Scanner(System.in);
		
		do
		{
			
		
			System.out.println("value of number: ");
			number = scanner.nextInt();
			
			if(hidden < number)
			{
				System.out.println("number too low");
			}
			else if(hidden > number)
			{
				System.out.println("number too high");
			}
			else
			{
				System.out.println("Try again");
			}
		} 
		while (hidden != number);
		
		System.out.println("¡Congratulations!");
	}
}
		
		
		
