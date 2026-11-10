// Pablo Blanco Ortiz

import java.util.Scanner;
public class Pablo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size, rows, columns;
        
        System.out.print("Enter the size: ");
        size=sc.nextInt();
        rows=size;
        columns=size;

        for (int row = 1; row <= size; row++) {
            for (int column = 1; column <= columns; column++) {
                System.out.print("*");
            }
            System.out.println();
            columns--;
        }
        sc.close();
    }
}
