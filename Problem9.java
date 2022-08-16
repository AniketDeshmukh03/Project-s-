package info.Problems;
import java.util.*;

public class Problem9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scObj= new Scanner(System.in);
		System.out.print("Enter the Number  :  ");
		int userNumber = scObj.nextInt();
		System.out.println("Entered value is :"   +userNumber);

		System.out.println("Even Numbers =");
		for (int ctr = 1; ctr <= userNumber; ctr++) {
			if(ctr % 2 == 0) {
				System.out.println(ctr);
			}
		}

		System.out.println("Odd Numbers =");
		for (int ctr = 1; ctr <= userNumber; ctr++) {
			if(ctr % 2 != 0) {
				System.out.println(ctr);
			}
		}

	}

}
