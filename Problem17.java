package info.Problems;

import java.util.*;

public class Problem17 {
	public static void main(String args[]) {
		//Reverse Number

		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number For Reverse it: ");
        int number = sc.nextInt();
        int reverseNum=0,reminder;
        int input=number;
        
        while (input>0) {
        	reminder=input%10;
        	reverseNum=reverseNum*10+reminder;
        	input/=10;
        		
		}
        System.out.println("Reverse  Number of "+input+" is:- "+reverseNum);
       
	}
}

