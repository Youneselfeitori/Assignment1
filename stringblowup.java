/******************************************************************
*Created By: Younes Elfeitori
*Created On: 17 September 2018
*This program is a string blowup program. it multiplies the numbrs by 
*the letter followed and it deletes a number if there is nothing after it
********************************************************************/

import java.util.Scanner;


public class stringblowup {
	
public static void main(String args[]){
		
		 //Declaring Values
		 StringBuffer buffer = new StringBuffer(18);
		 Scanner userinput = new Scanner(System.in);
		 String usersfirststring;
		 char nextplaceinstring;
		 char placeinstring;
		 int counter;
		 int appenedingcounter;

		 //Telling User What to do
		 System.out.println("Enter a string: ");
		 
		 //Assign values to variables
		 usersfirststring = userinput.nextLine();
		
		 
		 //Start Of Real Program
		 for (counter = 0; counter < usersfirststring.length(); counter++) {
         placeinstring = usersfirststring.charAt(counter); 
           
         if (Character.isDigit(placeinstring) && counter < usersfirststring.length()-1) { 
             nextplaceinstring = usersfirststring.charAt(counter + 1); 
	                    
	     if (!Character.isDigit(nextplaceinstring)){ 
	    	 int repTimes = Integer.parseInt(Character.toString(placeinstring));
	     for (appenedingcounter = 0; appenedingcounter < repTimes; appenedingcounter++) {
	                    		
	     buffer.append(nextplaceinstring); 
	         }
	     } else {
	     buffer.append(usersfirststring.charAt(counter+1)); //add the amount of letters the number is
	         }
	     } else {
	     buffer.append(placeinstring); //simply add if not digit
	         }
	         }
		 //End of program
		 System.out.println("The new string is: " + buffer);
	                    
			 }
		
	}
