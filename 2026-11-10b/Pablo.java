// Pablo Blanco Ortiz

import java.util.Scanner;
import java.util.Random;
public class Pablo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int key = random.nextInt(100); 
        int number;
        
        do{
        System.out.print("Guess the number: ");
        number = sc.nextInt();
        
        if (number>key) {
            System.out.println("You went too far.");
        } 
        else if (number<key) {
            System.out.println("You fell short.");
        } 
        else {
            System.out.println("Correct. You guessed it.");
        }
        }while (number!=key);
    }
}
