// Rubén Ramos
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int c;
        System.out.print("Enter a: ");
        a = sc.nextInt();
        System.out.print("Enter b: ");
        b = sc.nextInt();
        System.out.print("Enter c: ");
        c = sc.nextInt();
        int ecuacion = b * b - 4 * c * a;
        if (ecuacion < 0) {
            System.out.println("The equation has 0 solutions.");
        } else if (ecuacion == 0) {
            System.out.println("The equation has 1 solution.");
        } else {
            System.out.println("The equation has 2 solutions.");
        }
        sc.close();
    }
}
