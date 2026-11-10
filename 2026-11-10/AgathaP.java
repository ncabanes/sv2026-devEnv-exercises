import java.util.Scanner;

public class AgathaP
{
	public static void main(String[] args)
	{	
		Scanner s = new Scanner(System.in);
		
		double a, b, c, discriminant, x1, x2;
		
		System.out.print("value of a: ");
		a = s.nextDouble();
		System.out.print("value of b: ");
		b = s.nextDouble();
		System.out.print("value of c: ");
		c = s.nextDouble();
		
		discriminant = b*b - 4*a*c;
		if (discriminant < 0)
		{
			System.out.println("There's no solution");
		}
		
		else if (discriminant == 0)
		{
			System.out.println("1 solution: " + (-b / (2*a)));
		}
		
		else
		{
			x1 =(-b + Math.sqrt(discriminant)) / (2*a);
			x2 =(-b - Math.sqrt(discriminant)) / (2*a);
			System.out.println("There's 2 solutions: " +x1+ " and " +x2);
		}
		
		
	}	
}
