//Random Number-version 3 (1-100)
import java.util.Scanner;
import java.util.Random;

public class Diego3
	{	
			
	public static void main(String[] args) 	
	
	{			
		Random random = new Random();
		int hidden = random.nextInt (1,101);				
				
		int number = 0;
		int attempts = 7; 
		Scanner scanner = new Scanner(System.in);
						
		do
		{					
			System.out.println("value of number: ");
			number = scanner.nextInt();
					 
			if(number < hidden)
			{
				System.out.println("number too low");
				attempts--;
			}
			else if(number > hidden)
			{
				System.out.println("number too high");
				attempts--;
			}							
		} 
		while ((attempts > 0) && (number != hidden)) ;
		
		if (number == hidden)
		{
			System.out.println("¡Congratulations!");
		}						
		else 
		{
			System.out.println("Probe another time.");			
		}						
	}
}



