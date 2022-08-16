package info.Problems;

import java.util.*;

public class Problem8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scObj = new Scanner(System.in);

		System.out.print("Enter the number : ");

		int userNumber = scObj.nextInt();


		System.out.println("Even Numbers =");
		for ( int counter = 0; counter<=userNumber;counter+=2) {


			System.out.println(counter);
		}
	}
}
