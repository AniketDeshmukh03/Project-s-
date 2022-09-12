package info.Problems;

import java.util.*;

public class Problem13 {
	
	public static void main(String[]argss) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Rows : ");
		int rows = sc.nextInt();
		System.out.println("Enter the number of columns : ");
		int columns = sc.nextInt();
	
		int array[][] = new int [rows][columns];
		int counter = 0;
		
		System.out.println("Enter the number for matrix : ");
		for(;counter<rows;counter++) {
			
	
			
			for(int ctr=0;ctr<columns;ctr++) {
				
				System.out.println( "Enter Valus For "  +  counter+" "+"Row  & "+ ctr+"  "+"Columns:");
			
				array[counter][ctr] = sc.nextInt();
				
			}
		
			
		}
		
		System.out.println("Here is the "+ rows+" Row & " + columns+ " Columns Of Matrix:-");
		int ctr2 = 0;
		while (ctr2<rows) {

			int ctr=0;
			while (ctr<columns) {
				
				System.out.print(array[ctr2][ctr]+ "    " );	
				ctr++;
			}
			
			System.out.println( );
			ctr2++;
			
		}
		
		
	
		
	}

}
