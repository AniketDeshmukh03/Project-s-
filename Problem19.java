package info.Problems;
import java.util.*;

public class Problem19 {
	//palindrome
	
	public static void main(String[] args) {
	Scanner Obj = new Scanner (System.in);
	System.out.println("Enter a Number to  Check Palindrome");
	int num = Obj.nextInt();
	 int reverseNumer=0,reminder;
     int input=num;
     
     while (input>0) {
     	reminder=input%10;
     	reverseNumer=reverseNumer*10+reminder;
     	input/=10;
	
     }
     if (num==reverseNumer) {
    	 System.out.println("The given number "+num+" is Palindrome Number");
	} else {
		System.out.println("The given number  "+num+" is not Palindrome Number");
	}
	}
}
