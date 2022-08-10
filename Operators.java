public class Operators {

	public static void main(String[] args) {
		//OPERATORS:
		//1. UNARY ---------> 
		
		//A. INCREMENT
		
		byte number1 = 22;
		byte number2 = 30;
		System.out.println("PRE-INCREMENT:" +   ++number1);                       //PRE-INCREMENT 
		System.out.println(number2++);  
		System.out.println( "POST-INCREMENT:" +  number2);                           //Post-INCREMENT
		
		
		//B. DECREMENT:
		
		System.out.println("PRE-DECREMENT:" +     --number1);        // NUM1=22 PRE DECREMENT
		System.out.println(number2--);
		System.out.println("POST-DECREMENT:" +   number2);               //NUM2=30 POST DECREMENT
		System.out.println("------------------------------------------");
		//COMPLIMENT(~)
		byte number3 = -33;
		System.out.println(~number1);           //num1=22  +ve compliment
		System.out.println(~number3);            //-ve compliment
		
		//NOT(!)
		boolean isQualify = true;
		System.out.println(!isQualify);        //gives opp. value
		System.out.println("------------------------------------------");
		
		//2. ARITHMETIC OPERATORS:
		
		int marksOfScience = 80;
		int marksOfMaths   = 96;
		
		System.out.println("ADDITION:"  +( marksOfScience + marksOfMaths) );
		System.out.println("Substraction:"  + ( marksOfScience - marksOfMaths) );
		System.out.println("Multiplication:"  + ( marksOfScience * marksOfMaths) );
		
		System.out.println("Division:"  + ( marksOfScience / number1) );            //nm1=22
		System.out.println("Reminder:"  + ( marksOfScience % marksOfMaths) );
		
		System.out.println(number1);
		System.out.println(number2);
		System.out.println(number3);
		
		System.out.println("------------------------------------------");
		
		//3. Logical 
		//A. AND ---------> all condition are must be true
		
		System.out.println(number1>number2 && number2>number1);   
		System.out.println(number1<number2 && number2>number1);
		//B. OR ----------->if one of the cond^ true then o/p would be true
		
		System.out.println(number1<number2 || number2<number1);
		System.out.println(number1<number2 && number2>number1);
		System.out.println("------------------------------------------");
		
		//4. Bitwise
		
		System.out.println(number1 & number3);
		
			//100001---->-33 number3
		//perform 2scomp= 1scomp+1
				//o1111o------> 1S comp. of  number3
		        //+    1
		       // ----------
		        // 011111
		        //& 10110--->22 number1
		        // = ---------
		  		//  10110    o/p = 22  
		
		System.out.println(number1 | number2);
		System.out.println(number1 ^ number2);
		System.out.println("------------------------------------------");
		
	// 5. Assignment
		
		 int number4 = 14, number5 = 28;
			System.out.println(number4 + number5);
			number4 = number4 + 5;
			number5 = number5 - 12;
		
			System.out.println(number4 );
			System.out.println(number5);
			System.out.println("------------------------------------------");
			
			// 6. Relational
			
			System.out.println(number5 == number4);
			System.out.println(number5 >= number4);
			System.out.println(number5 <= number4);
			System.out.println(number5 != number4);
			System.out.println(number5 < number4);
			System.out.println(number5 > number4);
			System.out.println("------------------------------------------");
			
			 //7. Shift
			//1. Signed Left side (<<)

			System.out.println( number4 << 2);     //formula= (num4=19*2^n)--->19*4--->76

		
			//2. Signed Right side (>>)
			System.out.println(number4 >>2 );      // formula=  (num/2^n)----> 19/4--->4.7
			
			//3. UnSigned Right side (>>>)
			System.out.println(number4 >>>2 );  
			System.out.println("------------------------------------------");  
			
			
			// 8.Ternary(?:)
			

			System.out.println(number4 > 15 ? "It is True" + "=" + number4 : "It is False" );   //num4=19 if cond^n is true then go to(?)
			boolean output = number4 != 19;
			System.out.println(output  ? number4 + 5 :   number5 -2 + "---->" + "It is False");    //num5=16 if cond^n is false then go to(:)
			
			
			
		
	}

}
