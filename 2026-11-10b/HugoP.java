//Guess random number Hugo Puentes

import java.util.Scanner;
import java.util.Random;
public class HugoP{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Random rng = new Random();
		byte randomNumber = (byte)rng.nextInt(101);
		byte userNumber=-1;
		do{
			System.out.print("Tell me a number: ");
			userNumber=sc.nextByte();
			if(userNumber>randomNumber){
				System.out.println("Less than that");
			}
			else if(userNumber<randomNumber){
				System.out.println("More than that");
			}
			
		}while(userNumber!=randomNumber);
		System.out.println("CONGRATS!!");

		
	}
}
