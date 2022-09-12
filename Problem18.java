package info.Problems;

import java.util.Scanner;

public class Problem18 {
	//Left Diagonal = 0

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number of Rows : ");
		int rowsOfMatrix = obj.nextInt();
		System.out.println("Enter the number of columns : ");
		int columnsOfMatrix = obj.nextInt();

		int array[][] = new int [rowsOfMatrix][columnsOfMatrix];

		System.out.println("Enter the number for matrix : ");
		for(int counter = 0;counter<rowsOfMatrix;counter++) {

			for(int ctr=0;ctr<columnsOfMatrix;ctr++) {

				System.out.println( "Enter Valus For "  +  counter+" "+"Row  & "+ ctr+"  "+"Columns:");

				array[counter][ctr] = obj.nextInt();

			}
		}

		System.out.println("Here is the "+ rowsOfMatrix+" Rows & " + columnsOfMatrix+ " Columns Of Matrix:-");
		for(int ctr1 = 0;ctr1<rowsOfMatrix;ctr1++) {

			for(int ctr=0;ctr<columnsOfMatrix;ctr++) {

				System.out.print(array[ctr1][ctr]+"  ");

			}
			System.out.println( );

		}
		System.out.println("Left Diagonals are Zero" );

		for(int ctr2 = 0;ctr2<rowsOfMatrix;ctr2++) {

			for(int ctr1=0;ctr1<columnsOfMatrix;ctr1++) {

				if (ctr1==ctr2) {
					System.out.print(0+"   " );

				}
				else {
					System.out.print(array[ctr2][ctr1]+"   " );
				}

			}
			System.out.println( );
		}

	}
}
