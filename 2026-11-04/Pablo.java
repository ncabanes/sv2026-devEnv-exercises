// Pablo Blanco Ortiz

import java.util.Scanner;
public class Pablo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the high (rows): ");
        int high=sc.nextInt();

        System.out.print("Enter the width (columns): ");
        int width=sc.nextInt();

        for (int rows = 1; rows <= high; rows++) {
            for (int columns = 1; columns <= width; columns++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
