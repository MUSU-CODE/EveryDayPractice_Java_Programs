package programs100;

import java.util.HashSet;

public class FindDuplicateInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String arr[] = {"javas" , "python" , "java"} ;
		int arr[] = {1,1,2,2};
		
		boolean flag = false;
		
		//Approach 1
		
		 for(int i = 0 ; i < arr.length ; i++)
		{
			for(int j = i+1 ; j < arr.length ; j++)
			{
				if(arr[i] == arr[j])
				{System.out.println("found the duplicate " + arr[i]);
				
				flag = true ;
				}
				
			}
		}
       
		if (flag == false )
		{System.out.println("no duplicasy");} 
		
		//Approach 2
		
		/*HashSet <String> lang = new HashSet() ; //HashSet doesn't allow duplicate element
		   System.out.println( lang.add("java") ); // true
		   System.out.println( lang.add("java") ); //false
		   System.out.println( lang.add("python") ); //true  */
		
		/*for (String value : arr)
		{ if ( lang.add(value) == false )
                {System.out.println("duplication found " +value);
                  flag = true ;
                 }
        }
		
		if (flag == false )
		{System.out.println("no duplicasy");}*/
		
	}

}
