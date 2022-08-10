
public class Datatypes {

	
	public static void main(String[] args) {
		
		//Non-Primitive data Type
		//STRING DATA TYPES
		
		String favSport = "CRICKET";
		System.out.println( favSport);         //String literal 
		String FavSportsMan = "Virat Kohli";
		String  Obj = new  String (FavSportsMan );                  //String Object
	   System.out.println(   Obj   );
	   
//	   ARRAY DATA TYPES
	   String formsOfCricket[ ] = {"1.Test Cricket", "2.One Day International(ODI)", "3.T-20 International "};
	   
	 System.out.println("formsOfCricket:" + formsOfCricket[0]);
	 System.out.println( "formsOfCricket:"  + formsOfCricket[1]);
	 System.out.println(   "formsOfCricket:" +  formsOfCricket[2]);
	   System.out.println("-------------------------------------");
	   
	   
		//Primitive Data Type
		
		
	boolean isWorking = true;
  	System.out.println(isWorking);           //Boolean Type
	
			
	char firstLetterOfName = 'v';
	System.out.println(firstLetterOfName);   //char type
	int noOfPlayers = 11;
	System.out.println(noOfPlayers);             //integer
	byte learners = 10; 
	System.out.println(learners);              // Byte
	
	float percentage = 88.40f;
	System.out.println(percentage);
	long worldPopulation = 2040000000;
	System.out.println(worldPopulation);
	short  rollNumber = 7245;
	System.out.println(rollNumber );
	double temprature = 28.12; 
	System.out.println(temprature );
	System.out.println("------------------------------------------");
	
	//TYPE CASTING
	// 1. Implicit 
	int count =1890089; 
	long conversion = count ;
	float conversion1 = conversion ;
	System.out.println(count);
	System.out.println(conversion);
	
	System.out.println( conversion1);
	
	// 2. Explicit
	
	
	
	
	
	
	
	
	
	

	}

}
