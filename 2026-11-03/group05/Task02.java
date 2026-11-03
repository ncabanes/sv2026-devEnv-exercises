/* 
 * Ask the user for the current hour (0-23). Use if-else statements to determine:
    "Morning" if the hour is between 5 and 11.
    "Afternoon" if the hour is between 12 and 17.
    "Evening" if the hour is between 18 and 21.
    "Night" if the hour is between 22 and 4. 
    Héctor Cabrera Martinez
 */
//Modificado por Hugo

 import java.util.Scanner;
 public class Task02{
	 public static void main (String[] args){
		Scanner sc= new Scanner (System.in);
		System.out.print("Write an hour ");
		int hora= sc.nextInt();
		if(hora>=5 && hora<=11)
			System.out.print("Good Morning");
		else if(hora>=12 && hora<=17)
			System.out.print("Good Afternoon");
		else if(hora>=18 && hora<=21)
			System.out.print("Good Evening");
		else  if((hora>=22 && hora<=24) || (hora>=1 && hora<=4))
			System.out.print("Good Night");
		else
			System.out.print("Hour indefined");
		sc.close();
	}
}
