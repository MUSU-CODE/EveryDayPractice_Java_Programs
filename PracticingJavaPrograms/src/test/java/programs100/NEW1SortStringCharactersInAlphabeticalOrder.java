package programs100;

import java.util.Arrays;

public class NEW1SortStringCharactersInAlphabeticalOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "rock";
		char arr[] = str.toCharArray(); //this will extract all characters from the string and put it in array
		
		char temp;
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j= i+1; j<arr.length; j++)
			{
				if (arr[i]>arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}	
			}
		}
		System.out.println(new String(arr));
		
		//Approach 2
		
		String str1 = "rock";
		char chararr1[] = str1.toCharArray();
		Arrays.sort(chararr1);
		System.out.println(new String(chararr1));

	}

}
