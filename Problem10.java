package info.Problems;
import java.util.*;

public class Problem10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scObj = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int userNumber = scObj.nextInt();
		int sum = 0;
		
		System.out.print("Addition Of  the Given number =  "  );
		for(int ctr = 1; ctr <=userNumber; ctr++) {
			
			sum = sum + ctr;

			
		}
		System.out.println(sum);
	}

}
