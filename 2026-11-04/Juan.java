import java.util.Scanner;
public class Rectangulo {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int rows, columns;

        System.out.print("Introduce el numero de filas: ");
        rows=sc.nextInt();

        System.out.print("Introduce el numero de columnas: ");
        columns=sc.nextInt();

        for (int i=1; i<=rows; i++) {

            for(int j=1; j<=columns; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
