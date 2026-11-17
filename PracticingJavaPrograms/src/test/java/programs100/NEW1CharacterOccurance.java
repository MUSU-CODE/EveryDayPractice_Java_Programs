package programs100;

import java.util.HashMap;
import java.util.Map;

public class NEW1CharacterOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Approach 1
		String str = "hello";
		for (int i = 0; i < str.length(); i++) 
		{ char ch = str.charAt(i);
		   int count = 0;
            for (int j = 0; j < str.length(); j++) 
            { if (str.charAt(j) == ch)
             { count++; }
		    }
            // print only first occurrence
		       if (str.indexOf(ch) == i) 
		       { System.out.println(ch + " = " + count); }
		 }
		
		//Approach 2
		String str1 = "hii";
		Map<Character,Integer> map = new HashMap(); // we use hashmap because it has key value pair
		char[] letters = str1.toCharArray();        //hashmap doesn't follow insertion order
		for(char eachletter: letters)
		{
			if(! map.containsKey(eachletter))
			{
				map.put(eachletter, 1);
			}
			else 
			{ 
				int value = map.get(eachletter);
				map.put(eachletter, value+1);
			}
		}
		System.out.println(map);
		
	}

}
