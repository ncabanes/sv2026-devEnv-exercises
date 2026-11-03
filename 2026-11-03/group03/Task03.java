/* Ask the user to enter a year. Use an if-else statement to 
 * determine if the year is a leap year or not. A year is a 
 * leap year if it is divisible by 4 but not divisible by 100, 
 * unless it is also divisible by 400. 
 */
 
// Carlos Santos Durá

import java.util.Scanner;
public class Task03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a year: ");
		int year = sc.nextInt();
		
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
			System.out.println("Is a leap year");
		}
		else {
			System.out.println("Is NOT a leap year");
		}
	}
}
