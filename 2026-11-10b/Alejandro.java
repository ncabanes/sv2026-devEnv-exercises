// Alejandro Galvañ Gomis
import java.util.Scanner;
import java.util.Random;

public class Alejandro {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		
		int number = r.nextInt(100) + 1;
		int numberAsked;
		
		do {
			System.out.print("Number: ");
			numberAsked = s.nextInt();
			if (numberAsked > number) {
				System.out.println("The number is lower than " + numberAsked);
			}
			if (numberAsked < number) {
				System.out.println("The number is higher than " + numberAsked);
			}
		}
		while (numberAsked != number);
		
		System.out.println("You've guessed the number!");
	}
}
