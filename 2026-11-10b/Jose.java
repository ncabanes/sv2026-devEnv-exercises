import java.util.Scanner;
import java.util.Random;

public class Jose{
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		Random random = new Random();
		
		int numero = random.nextInt(100)+1;
		int intento;
		int intentos_restantes= 7;
		System.out.print("número:");
		intento = sc.nextInt();
		
		while(intento != numero && intentos_restantes > 0)
		{
			if(intento<numero)
			{
				System.out.println("Número es más grande");
				intentos_restantes--;
			}
			else
			{
				System.out.println("Número es más pequeño");
				intentos_restantes--;
			}
			System.out.print("te quedan:" + intentos_restantes +"intentos");
			System.out.print("número:");
			intento = sc.nextInt();
		}
		if(numero == intento)
		{
			System.out.println("¡Acertaste! es:" +numero);
		}
		else
		{
		System.out.print("te quedaste sin intentos, el numero correcto era:" + intento);
		}
	}
}
