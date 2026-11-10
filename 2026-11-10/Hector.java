//Hector Cabrera Martinez
import java.util.Scanner;
public class Hector{
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		double a, b, c, discriminado, x1, x2;
		System.out.println("Insert the a of the equacion ");
		a = sc.nextDouble();
		System.out.println("Insert the b of the equacion ");
		b = sc.nextDouble();
		System.out.println("Insert the c of the equacion ");
		c = sc.nextDouble();
		discriminado = b*b - 4*a*c;
		if(discriminado < 0){
			System.out.println("I can do the equacion because has no answer ");
		}
		else if(discriminado == 0){
				System.out.println("The equacion has only 1 answer " + (-b / (2*a)));
		}
		else{
			x1 = (-b + Math.sqrt(discriminado))/2*a;
			x2 = (+b + Math.sqrt(discriminado))/2*a;
			System.out.println("The equacion has 2 answer 1 "+ x1 + "; 2 "+ x2);
		}
		sc.close();
	}
}
