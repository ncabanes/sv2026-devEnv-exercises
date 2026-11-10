//Juan Flores
import java.util.Scanner;
public class Raizcuadrada {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a, b, c, discriminante;
        double x1, x2;

        System.out.print("Enter a: ");
        a = sc.nextDouble();

        System.out.print("Enter b: ");
        b = sc.nextDouble();

        System.out.print("Enter c: ");
        c = sc.nextDouble();

        if (a == 0) {
            System.out.println("You don´t have equation of second grade:");
        } 
        else {

            discriminante = (b * b) - (4 * a * c);

            if (discriminante > 0) {

                x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
                x2 = (-b - Math.sqrt(discriminante)) / (2 * a);

                System.out.println("You have 2 solutions");
                System.out.println("First solution: " + x1);
                System.out.println("Second solution: " + x2);

            } else if (discriminante == 0) {

                x1 = -b / (2 * a);

                System.out.println("There is 1 solution.");
                System.out.println("Solution: " + x1);

            } else {

                System.out.println("You don´t have solutions");

            }
        }

       
    }
}
