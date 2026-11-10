// tuber1a

import java.util.Scanner;

public class Brian 
{
	public static void main(String[] args)
	
	{
		Scanner s = new Scanner (System.in);
		
		double a=0, b=0, c=0, discriminant, x1, x2;
		System.out.println("enter the value 'a' for the square root: ");
		a = s.nextDouble();
		
		System.out.println("enter the value 'b' for the square root: ");
		b = s.nextDouble();
		
		System.out.println("enter the value 'b' for the square root: ");
		c = s.nextDouble();
		
		discriminant = b*b - 4*a*c;
		
		if(discriminant < 0)
		{
			System.out.println("there is not solution");
			
		}
		else if (discriminant == 0)
		{
			System.out.println("unique solution: "+ (-b / (2*a)));
		}
		else
		{
			x1 = (-b + Math.sqrt(discriminant)) / (2*a);
			x2 = (-b - Math.sqrt(discriminant)) / (2*a);
			System.out.println("Two Solutions: " + x1 + "and" + x2);
		}
		
	}
}
