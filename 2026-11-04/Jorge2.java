//JORGE GOLF SANTACREU
//Ejercicio Dibujar un triangulo segun lo q pida el usuario

import java.util.Scanner;

public class Jorge2 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int columns, rows;
        System.out.print("Introduce la altura del triangulo: ");
        columns = scanner.nextInt();
        System.out.print("Introduce el número de filas: ");
        rows = scanner.nextInt();
        for (int row = rows - 1; row >= 0; row--)
        {
            for (int column = 0; column < row; column++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}
