// Joel Albert Díaz

import java.util.Scanner;

public class Joel {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		double a, b, c, x1, x2, calculate;
		
		System.out.print("Solver for a quadratic equations Ax2 + : ");
		System.out.print("Enter the value of a, b and c: ");
		a = s.nextDouble();
		b = s.nextDouble();
		c = s.nextDouble();
		
		calculate = (b * b) - 4 * a * c;
		
		if(calculate < 0) {
			System.out.println("0 solutions.");
		}
		else if(calculate == 0) {
			System.out.println("1 solution: " + (-b / (2 * a)));
		}
		else {
			x1 = (-b + Math.sqrt(calculate)) / (2 * a);
			x2 = (-b - Math.sqrt(calculate)) / (2 * a);
			System.out.println("The 2 solutions is " + x1 + " and " + x2);
		}
	}
}
		
