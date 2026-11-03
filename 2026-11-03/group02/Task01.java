/* Write a program that takes three numbers as input from the user. 
 * Use if-else to find and display the largest number among them. */
import java.util.Scanner;
public class task01{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write the first number: ");
        double number1=scanner.nextDouble();
        System.out.print("Write the second number: ");
        double number2=scanner.nextDouble();
        System.out.print("Write the third number: ");
        double number3=scanner.nextDouble();

        if(number1>number2 && number1>number3){
            System.out.println("El número mayor es: "+number1);
        } else if(number2>number1 && number2>number3){
            System.out.println("El número mayor es: "+number2);
        } else{
            System.out.println("El número mayor es: "+number3);
        }
        

    }

}
