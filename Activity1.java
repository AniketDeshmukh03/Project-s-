public class Activity1 {

	public static void main(String[] args) {
		
        String favSport = "cricket ";              //str litteral
        String ground = new String(" wankhede");    //str obj
        
        System.out.println(favSport.length()+ground.length() );  
        
        System.out.println( favSport.compareTo(ground) >=0 ? "Yes" : "no") ;  
        
        System.out.println(favSport.substring(0, 1).toUpperCase().concat(favSport.substring(1, 7).toLowerCase())+(ground.stripTrailing().replace("w", "W"))  );
        
        
     
	
	}
}
