// Triangle

import java.util.Scanner;
public class HugoP2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.print("Size? ");
		size=sc.nextInt();
		
		for(int row=size ; row>=1;row--){
			for(int column=1 ; column<=row ;column++){
				System.out.print("*");
				}
			System.out.println();

			}
		}
	}
