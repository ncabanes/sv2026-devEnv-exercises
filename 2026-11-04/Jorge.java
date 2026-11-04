//JORGE GOLF SANTACREU
//Ejercicio Dibujar un rectangulo segun lo q pida el usuario

import java.util.Scanner;

public class Jorge {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int height, rows;
        System.out.print("Introduce la altura del rectángulo: ");
        height = scanner.nextInt();
        System.out.print("Introduce el número de filas: ");
        rows = scanner.nextInt();
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < height; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}
