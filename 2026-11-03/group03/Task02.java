/* 
 * Ask the user for the current hour (0-23). Use if-else statements to determine:
   "Morning" if the hour is between 5 and 11.
   "Afternoon" if the hour is between 12 and 17.
   Evening" if the hour is between 18 and 21.
   "Night" if the hour is between 22 and 4. 
 */

// Tuber1a

import java.util.Scanner;
public class Task02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la hora actual (0-23): ");
		int hora = sc.nextInt();
		
		if (hora < 0 || hora > 23) {
			System.out.println("Hora no válida");
		} else if (hora >= 5 && hora <= 11) {
			System.out.println("Morning");
		} else if (hora >= 12 && hora <= 17) {
			System.out.println("Afternoon");
		} else if (hora >= 18 && hora <= 21) {
			System.out.println("Evening");
		} else {
			System.out.println("Night");
		}
	}
}
