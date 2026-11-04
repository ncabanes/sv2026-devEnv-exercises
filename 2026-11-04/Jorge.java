//JORGE GOLF SANTACREU
//Ejercicio Dibujar un rectangulo segun lo q pida el usuario

import java.util.Scanner;

public class Jorge {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int columns, rows;
        System.out.print("Introduce la altura del rectángulo: ");
        columns = scanner.nextInt();
        System.out.print("Introduce el número de filas: ");
        rows = scanner.nextInt();
        for (int row = 0; row < rows; row++)
        {
            for (int column = 0; column < columns; column++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}
