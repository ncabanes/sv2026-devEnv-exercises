// JORGE GOLF SANTACREU
// Ejercicio crear un número aleatorio y el usuario tiene que adivinarlo (intentos infinitos hasta acertar)

import java.util.Random;
import java.util.Scanner;

public class NumeroAleatorio 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int numeroAleatorio = random.nextInt(100) + 1;
        int intentos = 0;
        int guess = 0;

        System.out.println("Guess the numbrer (enter 1 to 100)");

        do
        {
            System.out.print("Incorrect try another time: ");
            guess = scanner.nextInt();
            intentos++;

            if (guess < numeroAleatorio) {
                System.out.println("The number is Bigger");
            } else if (guess > numeroAleatorio) {
                System.out.println("The number is Minor");
            } else {
                System.out.println("You guess the number in" + intentos + " intents");
            }
        }
        while (guess != numeroAleatorio);

        scanner.close();
    }
}