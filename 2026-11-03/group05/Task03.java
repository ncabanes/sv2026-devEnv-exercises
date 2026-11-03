/* Ask the user to enter a year. Use an if-else statement to 
 * determine if the year is a leap year or not. A year is a 
 * leap year if it is divisible by 4 but not divisible by 100, 
 * unless it is also divisible by 400. 
 */
 
 import java.util.Scanner;
 public class Task03{
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		
		int year;
		
		System.out.print("Number of the year:");
		year = sc.nextInt();
		
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
		{
			System.out.print("Is leap");
		}
		else
		{
			System.out.print("Is not leap");
		}
	}
 }
 
 
