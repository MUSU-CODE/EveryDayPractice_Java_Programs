package programs100;

public class ReverseEachWordInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Welcome To Java";
		String[] words = str.split( "\\s" ); //Splitting String into words
		String reverseString = "" ;
		
		//Approach 1
		
		/* for (int i = words.length - 1; i >= 0; i--)  {reverseString = reverseString + words[i] + " ";}
		System.out.println(reverseString.trim()); */ //Java To Welcome
		
		
		/* for(String w: words)
		   {
			   String reverseWord="" ;
			
			   for(int i=w.length()-1 ; i>=0 ; i--)
			  {
				reverseWord = reverseWord + w.charAt(i);
			  }
			
			   reverseString = reverseString + reverseWord + " " ;
		   }
		
		  System.out.println( reverseString ); */
		
		
		//Approach 2
		
		/* String reverseWord = "" ;
		for(String w: words)
		{
			StringBuilder sb = new StringBuilder (w) ;
			sb.reverse();
			
			reverseWord = reverseWord + sb.toString() + " " ;
		}
		System.out.println( reverseWord ); */
		
		
		/* StringBuilder result = new StringBuilder();
		for (int i = words.length - 1; i >= 0; i--)   {result.append(words[i]).append(" ");}
		System.out.println(result.toString().trim()); */ //Java To Welcome
	}

}
