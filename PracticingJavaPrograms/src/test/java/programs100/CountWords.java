package programs100;

import java.util.Scanner;

public class CountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the sentence");
		Scanner scn = new Scanner (System.in);
		String s = scn.nextLine().trim();
				
		if (s.isEmpty()) { System.out.println("Total word count : 0") ; } 
		
		else {	int count = 1;
		
		         for(int i = 0; i < s.length(); i++)
		         {
		        	if( (s.charAt(i) == ' ') && (s.charAt(i+1)!=' ') ) 
		        	{
			        	count++ ;
		        	}
	          	 }	
		
	            	System.out.println("Total word count : " +count);
	         }
	}  

}
