//Rubén Ramos 04/11/2026
import java.util.Scanner;
public class rectangulo{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el número de filas: ");
        int filas = sc.nextInt();

        System.out.print("Introduce el número de columnas: ");
        int columnas = sc.nextInt();

        for (int i = 0; i < filas; i++) {
            for (int x = 0; x < columnas; x++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
