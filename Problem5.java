package info.Problems;

public class Problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int number = 6;
		if (number%2!=0 ) {
			System.out.println("Weird");

		}

		
        if (number%2==0 && number<5 && number>0 ) {
			System.out.println( "If 'n'=Even & range[2-5]   "+"---->"+"Not Weird");
			
		} 
        
        if (number%2==0 && number<20 && number>5) {
			System.out.println( "If 'n'=Even & range[6-20]   "+"---->"+" Weird");
			
		} 
		
        if (number%2==0  && number>20) {
			System.out.println(  "If 'n'=Even  & grater than 20"+"---->"+ "Not Weird");
			
		} 

	}
}



