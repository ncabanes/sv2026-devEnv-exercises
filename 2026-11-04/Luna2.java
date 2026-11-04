/*Luna Garcia Delgado
 * 4/11/2026
 */

import java.util.Scanner;

public class Luna2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte height;

        System.out.println("How tall is your triangle? ");
        height = scanner.nextByte();

        for (byte r = 1; r <= height; r++)
        {
            for (byte c = 1; c <= r; c++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
