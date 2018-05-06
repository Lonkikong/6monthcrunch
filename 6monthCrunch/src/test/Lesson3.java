package test;

public class Lesson3
{
	
	public static void main(String[] args)
	{
		
		int randomNumber = (int) (Math.random()* 50);
		
		/* Relational Operators:
		 * Java has 6 relational operators
		 * > : Greater Than
		 * < : Less Than
		 * == : Equal To
		 * != : Not Equal To
		 * >= : Greater Than Or Equal TO
		 * <= : Less Than Or Equal To
		 */
		
	
		        if (randomNumber < 25)
		
		        {
		
		            System.out.println("The random number is less than 25");
		        }
		         
	
		      
		        else if (randomNumber > 40)
	
		        {
		            System.out.println("The random number is greater than 40");
			        }

		        // Checks if randomNumber equals 18
		        else if (randomNumber <= 18)
		        {
		            System.out.println("The random number is equal to 18");
		
		        }
		// Checks if randomNumber is not equal to 40
		        else if (randomNumber >= 40)
		        	
		        {
		            System.out.println("The random number is not equal to 40");
		        }
		        
		        else
		        {
		        	System.out.println("nothing works");
		        }
		        
		        
		       if (!(false))
		        {
		    	   System.out.println("\nI turned false into true");
		       

	
		System.out.println("The random number is" + randomNumber);	
		
		
}
	}
}