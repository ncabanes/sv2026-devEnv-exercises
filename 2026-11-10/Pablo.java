// Pablo Blanco Ortiz
import java.util.Scanner;
public class Pablo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        System.out.print("Introduce A: ");
        a=sc.nextDouble();
        System.out.print("Introduce B: ");
        b=sc.nextDouble();
        System.out.print("Introduce C: ");
        c=sc.nextDouble();
        double discriminant = b*b-4*a*c;

        if (discriminant<0) {
            System.out.println("0 solutions");
        } 
        else if (discriminant==0) {
            System.out.println("1 solution:");
            System.out.println(-b / (2 * a));
        } 
        else {
            double root = Math.sqrt(discriminant);
            System.out.println("2 solutions:");
            System.out.println((-b+root)/(2*a));
            System.out.println((-b-root)/(2*a));
        }
    }
}
