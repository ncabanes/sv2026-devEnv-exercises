/* Ask the user to enter a year. Use an if-else statement to 
 * determine if the year is a leap year or not. A year is a 
 * leap year if it is divisible by 4 but not divisible by 100, 
 * unless it is also divisible by 400. 
 */
import java.util.Scanner;

public class Task03{
	public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } 
        else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
