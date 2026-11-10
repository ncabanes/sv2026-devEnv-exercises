// Gonzalo Martínez Díaz
import java.util.Scanner;
public class Gonzalo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("A: ");
		double A = sc.nextDouble();
		System.out.print("B: ");
		double B = sc.nextDouble();
		System.out.print("C: ");
		double C = sc.nextDouble();
		double resultPositive;
		double resultNegative;
		if ((B*B-4*A*C) < 0) {
			System.out.println("No real solution");
		}
		else if ((B*B-4*A*C) != 0)
		{
			resultPositive = (-B+Math.sqrt(B*B-4*A*C))/(2*A);
			System.out.println("Solution 1: X = " + resultPositive);
			resultNegative = (-B-Math.sqrt(B*B-4*A*C))/(2*A);
			System.out.println("Solution 2: X = " + resultNegative);
		}
		else 
		{
			System.out.println("X = " + -B/(2*A));
		}
	}
}
