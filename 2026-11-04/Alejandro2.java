import java.util.Scanner;
public class Alejandro2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int size;
		
		System.out.print("Size: ");
		size = s.nextInt();
		
		for (int y = 0; y <= size - 1; y++) {
			for (int x = size - y; x >= 1; x--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
