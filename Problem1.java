package info.Problems;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String favSport = "cricket ";              //str litteral
	        String ground = new String("wankhede");    //str obj
	        
	        System.out.println(favSport.length()+ground.length() );  
	        
	        System.out.println( favSport.compareTo(ground) >=0 ? "Yes" : "no") ;  
	        System.out.println(favSport.substring(0, 1).toUpperCase().concat(favSport.substring(1)) + (ground.substring(0, 1 ).toUpperCase()+ ground.substring(1)));

	        
		
		
	}

}
