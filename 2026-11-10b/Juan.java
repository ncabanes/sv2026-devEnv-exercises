//Juan Flores
import java.util.Scanner;
import java.util.Random;
public class Adivinarnumero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int secretNumber,userNumber;
        int attempts = 0;

        secretNumber = random.nextInt(100) + 1;

        System.out.println("Guess the number between 1 and 100.");

        do {
            System.out.print("Enter a number: ");
            userNumber = sc.nextInt();

            attempts++;

            if (userNumber > secretNumber) {
                System.out.println("The secret number is lower.");
            } else if (userNumber < secretNumber) {
                System.out.println("The secret number is higher.");
            } else {
                System.out.println("Correct! You guessed the number.");
                System.out.println("Number of attempts: " + attempts);
            }

        } while (userNumber != secretNumber);
    }
}
