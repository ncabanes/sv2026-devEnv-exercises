/* Ask the user to input their grade as a percentage (0-100). 
 * Use if-else to determine and display:

"A" for grades 90 and above.
"B" for grades between 80 and 89.
"C" for grades between 70 and 79.
"D" for grades between 60 and 69.
"F" for grades below 60.

*/
import java.util.Scanner;
public class Task04 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a grade: ");
        byte grade = sc.nextByte();
        if (grade < 60) {
            System.out.println("F");
        }
        else if (grade <= 69) {
            System.out.println("D");
        }
        else if (grade <= 79) {
            System.out.println("C");
        }
        else if (grade <= 89) {
            System.out.println("B");
        }
        else {
            System.out.println("A");
        }
    }
}
