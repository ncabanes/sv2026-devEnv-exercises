import java.util.Scanner;
import java.util.Random;
public class Gonzalo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rng = new Random();
		byte number = (byte) rng.nextInt(101);
		byte guess;
		do
		{
			System.out.print("Guess the number: ");
			guess = sc.nextByte();
			if (guess < number)
			{
				System.out.println("More");
			}
			else if (guess > number)
			{
				System.out.println("Less");
			}
			else System.out.println("You guessed it");
		}
		while (guess != number);	
	}
}
