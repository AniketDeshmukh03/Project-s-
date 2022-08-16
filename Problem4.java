package info.Problems;

public class Problem4 {

	public static void main(String args[]) {

		int number2 = 0;
		if (number2 % 7 ==0 && number2 >0) {
			System.out.println("Given Number is divisible by 7 &  Positive"); 



		}

		else if (number2 % 7 ==0 && number2 <0) {
			System.out.println("Given Number is  divisible by 7 & Negative" );
		}

		else if (number2 % 7 != 0 && number2 <0 ) {
			System.out.println("Given Number is not divisible by 7 & Negative" );
		}
		else if(number2 % 7 != 0 && number2 >0 )  {
			System.out.println("Given Number is not  divisible by 7 & Positive");
		}
		else {
			System.out.println("Given Number is zero");
		}
	}
}
