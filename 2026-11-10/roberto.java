//Roberto Leal 1 DAW 10/11/26
import java.util.Scanner;
public class roberto {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double a, b, c, root, x1, x2;
		
		System.out.print("a: ");
		a=sc.nextDouble();
		
		System.out.print("b: ");
		b=sc.nextDouble();
		
		System.out.print("c: ");
		c=sc.nextDouble();
		
		root=Math.sqrt((b*b)-4*(a*c));
		if(root<0) {
			System.out.println("No solution");
		}
		else if(root==0) {
			System.out.println("Unique solution: " + (-b/(2*a)));
		}
		else {
			x1=(-b+root) / (2*a);
			x2=(-b-root) / (2*a);
			System.out.println("2 solutions: "+x1+" and "+x2);
		}
	}
}
