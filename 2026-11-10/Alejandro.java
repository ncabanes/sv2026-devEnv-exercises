import java.util.Scanner;

public class Alejandro {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double a, b, c, root, solution1, solution2, discriminant;
		
		System.out.print("a: ");
		a = s.nextDouble();
		System.out.print("b: ");
		b = s.nextDouble();
		System.out.print("c: ");
		c = s.nextDouble();
		
		discriminant = (b*b)-(4*a*c);

		if (discriminant < 0) {
			System.out.println("There is no solution");
		}
		else if (discriminant > 0) {
			root = Math.sqrt(discriminant);
			System.out.println("There are two solutions");
			solution1 = (-b + root) / (2*a);
			solution2 = (-b - root) / (2*a);
			System.out.println("Solution: " + solution1 + " and " + solution2);
		}
		else {
			root = Math.sqrt(discriminant);
			System.out.println("There is one solution");
			solution1 = (-b + root) / (2*a);
			System.out.println("Solution: " + solution1);
		}
	}
}
