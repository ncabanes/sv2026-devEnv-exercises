/* 
 * Ask the user for the current hour (0-23). Use if-else statements to determine:
    "Morning" if the hour is between 5 and 11.
    "Afternoon" if the hour is between 12 and 17.
    "Evening" if the hour is between 18 and 21.
    "Night" if the hour is between 22 and 4. 
 */

 import java.util.Scanner;
 
 public class Task02 {
	 public static void main(String [] args) {
		 byte currentHour;
		 
		 Scanner s = new Scanner (System.in);
		 
		 System.out.print("Enter the current hour: ");
		 currentHour = s.nextByte();
		 
		 if(currentHour >= 5) {
			 if(currentHour <= 11) {
				 System.out.println("Morning.");
			 }
		 }
		 
		 if(currentHour >= 12) {
			 if(currentHour <= 17) {
				 System.out.println("Afternoon.");
			 }
		 }
				 
		if(currentHour >= 18) {
			 if(currentHour <= 21) {
				 System.out.println("Evening.");
			 }
		 }
				 
		if(currentHour >= 22) {
			 if(currentHour <= 4) {
				 System.out.println("Night.");
			 }
		 }
	 }
 }
