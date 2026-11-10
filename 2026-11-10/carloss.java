// Carlos Santos Durá

import java.util.Scanner;

public class carloss {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A: ");
		double a = sc.nextDouble();
		
		System.out.print("B: ");
		double b = sc.nextDouble();
		
		System.out.print("C: ");
		double c = sc.nextDouble();
		
		if (a == 0) {
			System.out.println("A CAN'T BE 0, REPEAT!");
		} else {
			double discriminant = (b * b) - (4 * a * c);
			
			if (discriminant > 0) {
				double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
				double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
				System.out.println("The equation has two real solutions:");
				System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);
			} else if (discriminant == 0) {
				double x = -b / (2 * a);
				System.out.println("The equation has a single real solution:");
				System.out.println("x = " + x);
			} else {
				System.out.println("Discriminat is negative, so the equation hasn't a real solution.");
			}
		}
	}
}
