// tuber1a

import java.util.Scanner;

public class Brian2
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner (System.in);
		
		int password, attemp;
		
		password = 6767;
	
		do{
			System.out.println("put the correct password: ");
			attemp = s.nextInt();
		} while(password != attemp);
		System.out.println("Nice!!!");
	}
}
