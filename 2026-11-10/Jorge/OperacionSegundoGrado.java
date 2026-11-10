//JORGE GOLF SANTACREU
//Ejercicio pedir a b c y hacer una operación de segundo grado, en caso de ser negativo mostrar q soluciones = 0 en caso de positivo mostrar las soluciones q tenga

import java.util.Scanner;

public class OperacionSegundoGrado 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the value of a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter the value of b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter the value of c: ");
        double c = scanner.nextDouble();
        double discriminant = Math.pow(-b, 2) - 4 * a * c;

        if (discriminant < 0) 
        {
            System.out.println("No solutions.");
        } 
        else if (discriminant == 0) 
        {
            double x = -b / (2 * a);
            System.out.println("The solution is: " + x);
        } 
        else
        {
            double sqrtDiscriminant = Math.sqrt(discriminant);
            double x1 = (-b + sqrtDiscriminant) / (2 * a);
            double x2 = (-b - sqrtDiscriminant) / (2 * a);
            System.out.println("The solutions are: " + x1 + " and " + x2);
        }

        scanner.close();
    }
}
