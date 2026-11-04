// Rectangle

import java.util.Scanner;
public class HugoP{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int rows,columns;
		
		System.out.print("Rows? ");
		rows=sc.nextInt();
		System.out.print("Columns? ");
		columns=sc.nextInt();
		for(int r=1 ; r<=rows;r++){
			for(int c=1 ; c<=columns;c++){
				System.out.print("*");
				}
			System.out.println();
			
			}
		}
	}
