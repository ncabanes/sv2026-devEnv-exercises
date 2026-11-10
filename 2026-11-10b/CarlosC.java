import java.util.Scanner;
import java.util.Random;

public class CarlosC {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in); 
        Random generator = new Random();
        int secretNumber = generator.nextInt(0, 100);
        
        System.out.println("Take a guess of the number (between 0 and 99):");
        do {
            number = sc.nextInt(); 
            
            if (number > secretNumber) {
                System.out.println("Good try: " + number + " is higher.");
                System.out.println("Bad, that wasn't the number. Try with another number: ");
            } 
            else if (number < secretNumber) {
                System.out.println("Good try: " + number + " is smaller.");
                System.out.println("Bad, that wasn't the number. Try with another number: ");
            }
        } 
        while (number != secretNumber);
        
        System.out.println("Correct! The number is: " + secretNumber);
    }
}
