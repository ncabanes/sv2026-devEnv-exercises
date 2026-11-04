//Roberto Leal Carrizo 1 DAW 04/11
import java.util.Scanner;
public class Roberto2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int size;
		System.out.print("Size: ");
		size=sc.nextInt();

		for(int i=0; i<=size-1; i++) {
			for(int c=size-i; c>=1; c--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
