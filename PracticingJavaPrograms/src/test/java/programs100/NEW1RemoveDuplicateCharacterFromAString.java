package programs100;

public class NEW1RemoveDuplicateCharacterFromAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Programming p";
		
		//Approach 1
		/* StringBuilder sb = new StringBuilder() ;
		for(int i=0; i<str.length(); i++)
		{
			char ch = str.charAt(i); //we traverse the string using for loop and get each character
			int indx = str.indexOf(ch, i+1); //while traversing the string, whtever the character(i.e index i) we got, we check which index or where it present starting checking from i+1 till string end , and indexOf() give first occurrence of character so once it found first occurrence it stop searching more
			if(indx == -1) //-1 return in index position when given character i.e ch here isn't available in the string
			{sb.append(ch);} //then we add that character i.e ch here in StringBuilder
		}
		System.out.println(sb); */
		
		
		//Approach 2
		
		//boolean flag = false;//Once flag becomes true, it stays true forever because you're not resetting it for each character. So writing flag here isn't correct
		
		char[] arr = str.toCharArray(); //converting string to character array
		StringBuilder sb1 = new StringBuilder();
		for(int i=0; i<arr.length; i++) // use logic of find duplicates in array
		{   
			boolean flag = false;  // Reset for every character
			for(int j=0; j<i; j++)
			{
				if (arr[i] == arr[j])
				{
					flag = true;
					break;
				}
			}
			if (flag == false)
			{ sb1.append(arr[i]); }
		}
		System.out.println(sb1);

	}
	
}
