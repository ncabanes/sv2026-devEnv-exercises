//Guess random number Hugo Puentes

import java.util.Scanner;
import java.util.Random;
public class HugoP{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Random rng = new Random();
		byte randomNumber = (byte)rng.nextInt(101);
		byte userNumber=-1;
		byte trys=7;
		System.out.println("At lest you tried, the number was " + randomNumber);
		do{
			System.out.print("Tell me a number: ");
			userNumber=sc.nextByte();
			if(userNumber>randomNumber){
				System.out.println("Less than that");
			}
			else if(userNumber<randomNumber){
				System.out.println("More than that");
			}
			trys--;
			System.out.println("Remain tries:" + trys);
			
		}while(userNumber!=randomNumber && trys>0);
		if(userNumber==randomNumber) System.out.println("CONGRATS!!");
		else System.out.println("At lest you tried, the number was " + randomNumber);

		
	}
}
