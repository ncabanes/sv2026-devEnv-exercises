import java.util.Scanner;
import java.util.Random;

public class Jose{
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		Random random = new Random();
		
		int numero = random.nextInt(100)+1;
		int intento;
		
		System.out.print("número:");
		intento = sc.nextInt();
		
		while(intento != numero)
		{
			if(intento<numero)
			{
				System.out.println("Número es más grande");
			}
			else
			{
				System.out.println("Número es más pequeño");
			}
			System.out.print("número:");
			intento = sc.nextInt();
		}
		System.out.println("¡Acertaste! es:" +numero);
	}
}
