
import java.util.Scanner;

public class jose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a,b,c,x1,x2,discriminant;

        System.out.print("A:");
        a = sc.nextDouble();

        System.out.print("B:");
        b = sc.nextDouble();

        System.out.print("C:");
        c = sc.nextDouble();

        discriminant = b*b - 4*a*c;

        if (discriminant < 0) {
            System.out.print("No solution");
        }
        else if (discriminant == 0) {
            x1 = -b / (2*a);
            System.out.print("1 Solution: " + x1);
        }
        else {
            x1 = (-b + Math.sqrt(discriminant)) / (2*a);
            x2 = (-b - Math.sqrt(discriminant)) / (2*a);

            System.out.print("Solution 1: " + x1);
            System.out.print(" Solution 2: " + x2);
        }
    }
}

