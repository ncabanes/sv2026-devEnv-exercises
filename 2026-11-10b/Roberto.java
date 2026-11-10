//Roberto Leal 1 DAW 10/11/26
import java.util.Scanner;
import java.util.Random;
public class Roberto {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int numEntero = random.nextInt(100)+1;
		int numUser;
		
		do {
			System.out.print("Number: ");
			numUser=sc.nextInt();
			if(numUser>numEntero) {
				System.out.println(numUser + " Is bigger");
			}
			else if(numUser<numEntero) {
				System.out.println(numUser + " Is lower");
			}
			else {
				System.out.println(numUser + " Is correct!");
			}
		}
		while(numUser!=numEntero);
	}
}
