//Rubén Ramos
import java.util.Scanner;
public class Ruben{
	public static void main (String [] args){
	int random = (int) (Math.random() * 100) + 1;
	int n1=0;
	Scanner sc = new Scanner (System.in);
	do{
		System.out.println("Insert a number ");
		number = sc.nextInt();
		if (random>n1)
		{
			System.out.println("The number is a quinda lower put a higher number ");
		}
		else if (random<n1)
		{
			System.out.println("The number is a quinda higher put a lower number");
		}
	}while(random!=n1);
		System.out.println("Congrats the number is: "+ random);
	sc.close();
	}
}
