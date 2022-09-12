package info.Problems;

import java.util.*;

public class Problem16 {
	public static void main(String[ ] args) {
		Scanner Obj =  new Scanner(System.in);
		System.out.println("Enter a number to Find It's the Armstrong:");
		int userNum = Obj.nextInt();
		int add=0;
		int value=userNum;
		
		while ( 0<userNum) {
			int rem = userNum%10;


			add+= (rem*rem*rem);

			userNum = userNum/10;


		}
		

		if (value==add) {
			System.out.println("Entered Value "+value +" is Armstrong Number");
		}
		else {
			System.out.println("Entered Value "+ value+" is Not Armstrong Number");
		}
		userNum++;	
		
	}

}


