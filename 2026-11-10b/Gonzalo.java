// Guess number game V2 | Gonzalo Martínez Díaz

import java.util.Scanner;
import java.util.Random;
public class Gonzalo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rng = new Random();
		byte number = (byte) rng.nextInt(101);
		byte guess;
		byte attempts = 7;
		do
		{
			System.out.print("Guess the number: ");
			guess = sc.nextByte();
			if (guess < number)
			{
				System.out.println("More " + attempts + " attempts left");
				attempts--;
			}
			else if (guess > number)
			{
				System.out.println("Less " + attempts + " attempts left");
				attempts--;
			}
		}
		while (guess != number && attempts >= 0);
		if (attempts > 0) System.out.println("You guessed it");
		else System.out.println("You ran out of attempts, the number was " + number);
		
	}
}
