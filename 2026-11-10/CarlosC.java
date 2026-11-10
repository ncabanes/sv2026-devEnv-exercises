import java.util.Scanner;

public class CarlosC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, discriminant, x1, x2;
        
        System.out.println("Give me a: ");
        a = sc.nextDouble();
        
        System.out.println("Give me b: ");
        b = sc.nextDouble();
        
        System.out.println("Give me c: ");
        c = sc.nextDouble();
        
        discriminant = b * b - 4 * a * c;
        
        if (discriminant < 0) {
            System.out.println("There is no solution");
        } 
        else if (discriminant == 0) {
            System.out.println("Unique solution: " + (-b / (2 * a)));
        } 
        else {
            x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Two solutions: " + x1 + " and " + x2);
        }
    }
}
