//Rubén Ramos
import util.java.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int c;
		System.out.print("enter a");
		a= sc.nextInt();
		System.out.print("enter b");
		b= sc.nextInt();
		System.out.print("enter c");
		c= sc.nextInt();
		int ecuacion= b*b-4*c*a;
		if (ecuacion < 0) {
            System.out.println("The equation has 0 solutions.");
        } else if (ecuacion == 0) {
            System.out.println("the equation has 1 solutions");
        } else {
            System.out.println("the equation has 2 solutions");
        }
    }
}
