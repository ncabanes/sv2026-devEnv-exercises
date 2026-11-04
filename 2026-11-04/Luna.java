import java.util.Scanner;

public class Luna {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte rows, columns;

        System.out.println("How many rows? ");
        rows = scanner.nextByte();

        System.out.println("How many columns? ");
        columns = scanner.nextByte();

        for (byte r = 1; r <= rows; r++)
        {
            for (byte c = 1; c <= columns; c++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
