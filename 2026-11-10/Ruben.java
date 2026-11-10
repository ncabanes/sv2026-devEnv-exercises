
//Rubén Ramos
import util.java.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int c;
		System.out.print("introduce un numero");
		a= sc.nextInt();
		System.out.print("introduce otro numero");
		b= sc.nextInt();
		System.out.print("introduce otro numero");
		c= sc.nextInt();
		int ecuacion= b*b-4*c*a;
		if (ecuacion < 0) {
            System.out.println("La ecuacion tiene 0 soluciones");
        } else if (ecuacion == 0) {
            System.out.println("La ecuacion tiene 1 solucion");
        } else {
            System.out.println("La ecuacion tiene 2 soluciones");
        }
    }
}
