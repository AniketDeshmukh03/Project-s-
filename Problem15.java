package info.Problems;

import java.util.*;

public class Problem15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scObj = new Scanner(System.in);
		System.out.println("Enter a number to check the factorial:");
		int userNumber = scObj.nextInt();
		int productOfNumber = 1;
		int num = 1;
		while(num <= userNumber) { 
			productOfNumber *= num;   
			num++;  
		}
		System.out.println("The factorial of b "+userNumber+"! is = "+ productOfNumber);	

	}
}
