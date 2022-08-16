package info.Problems;

import java.util.Scanner;

public class Problem7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner scObj = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int userNumber = scObj.nextInt();

		System.out.println("Odd Numbers =");
		int counter = 0;

		while (counter<=userNumber) {

			if (counter%2!=0) {
				System.out.println( counter);	

			}

			counter++;	
		}

	}

}
