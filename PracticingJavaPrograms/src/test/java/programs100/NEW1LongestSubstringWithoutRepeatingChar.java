package programs100;

import java.util.LinkedHashMap;
import java.util.Map;

public class NEW1LongestSubstringWithoutRepeatingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		lengthOfLongestSubString("abbacdb"); }
	
	public static void lengthOfLongestSubString(String str)
	{
       String longestSubString = null;
       int longestSubStringLength = 0;
       
       Map<Character,Integer> map = new LinkedHashMap<Character,Integer>() ; // linkedHashMap used because only HashMap doesn't follow insertion order
       
       char[] charr = str.toCharArray();
       
       for(int i=0; i<charr.length; i++)
       {
    	   char ch = charr[i];
    	   
    	   if(!map.containsKey(ch))
    	   {
    		   map.put(ch, i);//a->0 , b->1 , b->2
    	   }
    	   else
    	   {
    		   i = map.get(ch);// if key is already available (like b->1) we replace i value with the key value
    		   map.clear();//it'll clear the entry went in the map
    	   }
    	   if(map.size()>longestSubStringLength)
    	   {
    		   longestSubStringLength = map.size();
    		   longestSubString = map.keySet().toString();//trying to get all the keys available in the map by using keyset()
    	   }
       }
       
       System.out.println("The longest substring " +longestSubString);
       System.out.println("the longest substring length " +longestSubStringLength);
       
       
       //Approach 2
       
       //public static void main(String[] args) {
        String str1 = "abbacdbok";
    	String longest = "";
    	  for (int i = 0; i < str1.length(); i++) // Outer loop decides the starting position of substring
    	  { String temp = ""; // Temporary string to build current substring
          for (int j = i; j < str1.length(); j++) // Inner loop starts from current index i and moves towards the end of string
          { char ch = str1.charAt(j); // Fetch current character
             if (temp.indexOf(ch) != -1) // Check if current character is already present in temp indexOf() returns -1 if character is not found
             { break;} // Duplicate character found Stop building this substring
            temp = temp + ch; // Add current character to temp substring
          if (temp.length() > longest.length()) // Check if current substring is longer than previously stored longest substring
          { longest = temp;} // Update longest substring
          }
         }
       System.out.println("Longest Substring = " + longest);
       System.out.println("Length = " + longest.length());
     }
    	   
}

