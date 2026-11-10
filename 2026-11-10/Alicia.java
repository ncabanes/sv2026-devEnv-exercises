//Alicia Linares
import java.util.Scanner;

public class Alicia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        System.out.print("Insert A: ");
        a = sc.nextDouble();
        System.out.print("Insert B: ");
        b = sc.nextDouble();
        System.out.print("Insert C: ");
        c = sc.nextDouble();
        double discriminant= b*b -4*a*c;
		if(discriminant==0){
			System.out.println("There is one solution");
			System.out.print(-b/(2*a));
		}
		else if (discriminant<0)
		{
			System.out.println("0 solutions");
		}
		else {
			
			double raiz = Math.sqrt(discriminant);
			System.out.println("There is 2 solutions: ");
			System.out.println((-b+raiz)/(2*a));
			System.out.println((-b-raiz)/(2*a));
		}
		
		
    }
}
