//Héctor Cabrera Martinez
import java.util.Scanner;
public class Hector{
	public static void main (String [] args){
	int random = (int) (Math.random() * 100) + 1;
	int number=0, remainimgtry=0;
	Scanner sc = new Scanner (System.in);
	do{
		System.out.println("You already do: "+ remainimgtry +" try, Insert a number ");
		number = sc.nextInt();
		remainimgtry=remainimgtry+1;
		if (random>number)
		{
			System.out.println("The number is a quinda lower put a higher number ");
		}
		else if (random<number)
		{
			System.out.println("The number is a quinda higher put a lower number");
		}
	}while(random!=number && remainimgtry!=7);
	if(random==number)
		System.out.println("Congrats the number is: "+ random);
	else
		System.out.println("You fail the number was: "+ random);
	sc.close();
	}
}
