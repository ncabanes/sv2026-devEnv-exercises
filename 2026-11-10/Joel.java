// Joel Albert Díaz

import java.util.Scanner;

public class Joel {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		double a, b, c;
		double calculate;
		
		System.out.print("Enter the value of a, b and c: ");
		a = s.nextDouble();
		b = s.nextDouble();
		c = s.nextDouble();
		
		calculate = Math.sqrt((b*b) - 4 * a * c);
		
		if(calculate == 0) {
			System.out.println("0 solutions.");
		}
		else if(calculate > 0) {
			System.out.println("2 solutions.");
		}
		else {
			System.out.println("1 solutions.");
		}
	}
}
		
