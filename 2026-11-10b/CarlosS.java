// Carlos Santos Durá

import java.util.Scanner;
import java.util.Random;

public class CarlosS {
	public static void main(String[] args) {
		
		Random generator = new Random();
		Scanner sc = new Scanner(System.in);
		int number=0;
		int key=generator.nextInt(100)+1;
		
		do {
			System.out.print("Guess a number 1-100: ");
			number = sc.nextInt();
			
			if (number>key) {
				System.out.println("Less");
			}
			else if (number<key) {
				System.out.println("More");
			}
		} while (number!=key);
		
		System.out.println("YOU GOT IT!");
	}
}
