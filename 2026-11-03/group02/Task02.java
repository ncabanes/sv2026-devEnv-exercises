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
            System.out.println("Morning");
        } 
        else if (currentHour >= 12 && currentHour <= 17) {
            System.out.println("Afternoon");
        } 
        else if (currentHour >= 18 && currentHour <= 21) {
            System.out.println("Evening");
        } 
        else if ((currentHour >= 22 && currentHour <= 23) || (currentHour >= 0 && currentHour <= 4)) {
            System.out.println("Night");
        } 
        else {
            System.out.println("Incorrect hour, enter a number between 0 and 23.");
        }
        sc.close();
    }
}

