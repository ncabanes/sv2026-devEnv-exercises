/* Write a program that takes three numbers as input from the user. 
 * Use if-else to find and display the largest number among them. */

import java.util.Scanner;
public class Task01 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n1, n2, n3, largest;
		
		System.out.print("Write three numbers: ");
		n1 = s.nextInt();
		n2 = s.nextInt();
		n3 = s.nextInt();
		
		if (n1 >= n2 && n1 >= n3) {
			largest = n1;
		}
		else if (n2 >= n1 && n2 >= n3) {
			largest = n2;
		}
		else {
			largest = n3;
		}
		
		System.out.println("The largest number is: " + largest);
	}
}
