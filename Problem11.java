package info.Problems;

import java.util.*;

public class Problem11 {

	public static void main(String args[]) {
		// TODO Auto-generated method stub

		Scanner scObj = new Scanner(System.in);
     
		int array[] = {78,79,0,-1,-212};
	

		for(int ctr = 0; ctr <= array.length-1; ctr++ ) {


			if (array[ctr]>0 && array[ctr]%2==0) 
			{

				System.out.println(array[ctr] +" " + "This Number is Positive & Divisible By '2' ");
			}
				
				else if(array[ctr]%2==0 && array[ctr]<0) {
					System.out.println(array[ctr] + " " + "This Number is Negative  & Divisible By '2' ");

				}
				
				else if(array[ctr]%2!=0 && array[ctr]>0) {
					System.out.println(array[ctr] + " "+ "This Number is Positive  & Not Divisible By '2' ");

			    }

				 else if(array[ctr]%2!=0 && array[ctr]<0) {
						System.out.println(array[ctr] +" "+  "This Number is Negative  & Not Divisible By '2' ");

				        }

			  else {
	            	System.out.println(array[ctr] +" "+ "This Number is neither Positive nor Negative because It is zero ");

	             }
			
		}
	
}
}
