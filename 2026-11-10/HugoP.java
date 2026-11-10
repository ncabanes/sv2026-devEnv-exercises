//Quadratic equations Hugo Puentes
import java.util.Scanner;
public class HugoP{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Tell me A: ");
		double a = sc.nextDouble();
		System.out.print("Tell me B: ");
		double b = sc.nextDouble();
		System.out.print("Tell me C: ");
		double c = sc.nextDouble();
		
		double xmas;
		double xmenos;
		double discriminant = b*b - 4*a*c;
		
		if(discriminant < 0){
			System.out.print("Impossible solution");
		}
		
		
		else if(discriminant == 0){
			xmas=-b+Math.sqrt(discriminant)/(2*a);
			System.out.println("Unique solution" + (-b / (2*a)));
			}
			
			
		else{
			xmas=(-b+Math.sqrt(discriminant)) / (2*a);
			xmenos=(-b-Math.sqrt(discriminant)) / (2*a);
			System.out.println("Positive solution: " + xmas);
			System.out.println("Negative solution: " + xmenos);
			
		}
		
		
		
		}
	}
