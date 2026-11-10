//Random Number-version 2 (1-100)
import java.util.Scanner;
import java.util.Random;

public class Diego2 
	{	
			
	public static void main(String[] args) 	
	
	{			
		Random random = new Random();
		int hidden = random.nextInt (1,101);				
				
		int number = 0;
		Scanner scanner = new Scanner(System.in);
				
		do
		{		
			
			System.out.println("value of number: ");
			number = scanner.nextInt();
			
			if(number < hidden)
			{
				System.out.println("number too low");
			}
			else if(number > hidden)
			{
				System.out.println("number too high");
			}
		} 
		while (hidden != number);
		
		System.out.println("¡Congratulations!");
		
	}
}
