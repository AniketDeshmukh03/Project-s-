package info.Problems;

import java.util.*;

public class Problem12 {

	public static void main (String[] args) {

		Scanner obj = new Scanner (System.in);
		System.out.println("Enter the Sentence to check the count of Vowels, Consonants & Whitespeces  :"  );
		String userSentence = obj.nextLine();
	
		int vowel = 0, consonants=0, whitespeces=0;
		int[] vowelWord = {'a','e','i', 'o', 'u','A','E','I', 'O','U'};      //declare & initialize the array with vowel

		
		//Nested loop
		int counter=0;
		while( counter<=userSentence.length()-1  ) {    //checking for 

			int ctr=0;
			while ( ctr<=vowelWord.length-1) {


				if (userSentence.charAt(counter) == (vowelWord[ctr])) {  //user value & vowel value matched then print the only vowel

					vowel++;      
					System.out.println(userSentence.charAt(counter) );
					//System.out.println((vowelWord[vowel]) +"  "+ counter);





				}

				ctr++;
			}


			if (userSentence.charAt(counter) == ' ') {  //uservalue = this space 
				//System.out.println( );
				whitespeces++;
			}

			else {

				consonants = (userSentence.length() - (whitespeces+vowel));
			}

			counter++;
		}


		System.out.println("Number of Vowels in Sentence"+" = "+ vowel);	

		System.out.println("Number of Consonants in Sentence"+" = "+ consonants);	
		System.out.println("Number of  Whitespeces in Sentence"+" = "+ whitespeces);



		System.out.println("Number of Letters in Sentence"+" = " + userSentence.length());

	}
}