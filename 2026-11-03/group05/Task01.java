/* Write a program that takes three numbers as input from the user. 
 * Use if-else to find and display the largest number among them. */
import java.util.Scanner;
public class Task01{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int number1,number2,number3,largest;
		
		System.out.print("Number one: ");
		number1= sc.nextInt();
		
		System.out.print("Number two: ");
		number2= sc.nextInt();
		
		System.out.print("Number three: ");
		number3= sc.nextInt();
		
		if(number1>=number2 && number1>=number3){
			largest=number1;
			}
		else if(number2>=number1 && number2>=number3){
			largest=number2;
			}
		else{
			largest=number3;
			}
			System.out.print("The largest number: " + largest);
		}
	}
/*revisado por jose*/
