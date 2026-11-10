//Quadratic Equation
import java.util.Scanner;

public class Diego {
		
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in); 
		
		double a, b, c, discriminant, x1, x2;
		
		System.out.println("value of a: ");
		a = scanner.nextDouble();
		
		System.out.println("value of b: ");
		b = scanner.nextDouble();
		
		System.out.println("value of c: ");
		c = scanner.nextDouble();
		
		discriminant = b * b - 4 * a * c;
		if (discriminant < 0)
		{
			System.out.println("No Solution");
		}
		else if (discriminant == 0)
		{
			System.out.println("One solution: " + (-b / (2*a)));
		}
		else
		{
			x1 = (-b + Math.sqrt(discriminant)) / (2*a);
			x2 = (-b - Math.sqrt(discriminant)) / (2*a);
			System.out.println("Two solutions: " + x1 + " and " + x2);
		}						
	}
}
