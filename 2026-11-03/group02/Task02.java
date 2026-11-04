/* 
 * Ask the user for the current hour (0-23). Use if-else statements to determine:
    "Morning" if the hour is between 5 and 11.
    "Afternoon" if the hour is between 12 and 17.
    "Evening" if the hour is between 18 and 21.
    "Night" if the hour is between 22 and 4. 
 */
 

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int currentHour;
        System.out.print("What time is it???? ");
        currentHour = sc.nextInt();

        if (currentHour >= 5 && currentHour <= 11) {
            System.out.println("Morning (hour is between 5am and 11am)");
        } 
        else if (currentHour >= 12 && currentHour <= 17) {
            System.out.println("Afternoon (hour is between 12pm and 17pm) ");
        } 
        else if (currentHour >= 18 && currentHour <= 21) {
            System.out.println("Evening (hour is between 18pm and 21pm)");
        } 
        else if ((currentHour >= 22 && currentHour <= 23) || (currentHour >= 0 && currentHour <= 4)) {
            System.out.println("Night (the hour is between 22pm and 4am)");
        } 
        else {
            System.out.println("Incorrect hour, enter a number between 0 and 23.");
        }
    }
}

