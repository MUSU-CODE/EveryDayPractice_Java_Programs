package programs100;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {21, 27, 30}; // should be in sorting order
		
		//Approach : 1
		int search = 30; // here it break the array from middle and start searching
		
		boolean flag = false;
		
		int low = 0;
		int high = arr.length-1 ; 
		
		while (low<=high)
		{
			int mid = (low+high)/2 ;
			
			if(arr[mid] == search)
			{System.out.println("element found " +arr[mid] +" at " +mid);
			 flag = true;
			 break;
			}
			
			if(arr[mid] < search)
			{low = mid+1;}
			
			if(arr[mid] > search)
			{high = mid -1 ;}
		}
		
		if (flag==false)
		{System.out.println("nh");}
		
		//Approach : 2
		
		//System.out.println( "element found at " +Arrays.binarySearch(arr, 30) );
	}

}
//(Reverse a string), (Check Palindrome), (Count Character Frequency), (Find Duplicate Characters), (Remove Duplicate Characters),  Count Uppercase, Lowercase, Digits And Space, Reverse A String While Preserving Special Characters, (Find First Non Repeating Character), Find The First Repeating Character, (Reverse Each Word In A Sentence), (Count Words In A Sentence), Check Whether Two Strings Are Anagrams, Find Duplicate Words In A Sentence, Find The Most Frequent Character, Find The Second Most Frequent Character, Check Whether A String Contains Only Digits, Count Vowels And Consonants, Find The Longest Word In A String, Check Whether One String Is A Rotation Of Another, Reverse A String While Preserving Special Characters, Find All Substring Of A String, Compress Consecutive Repeated Characters
//(Find The Largest And Smallest Element In An Array), Find Second Largest And Smallest Distinct Number, (Find Max And Min In An Array), (Sort An Array In Ascending Order), Find Common Elements In Two Arrays, (Check Whether A Number Is Prime), (Print Fibonacci Series), Check Whether A Number Is An Armstrong Number, (Swap Two Numbers Without A Third Variable), (Find Missing Number From 1 To N), (Find Duplicate Elements In An Array), Remove Duplicates From An Array, Find All Pairs Whose Sum Equals A Target, (BubbleSort), (LenearSearch), Move All Zeros To The End, Reverse An Array In Place, Rotate An Array To The Left And Right By K Positions, Find The Maximum Sum Of A Contiguous Subarray, Merge Two Sorted Arrays, Find The Frequency Of Each Array Element, Find The First Repeating Array Element, Find The Intersection Of Two Sorted Arrays, Find The Majority Element
//Remove Duplicates From An ArrayList, Sort A HashMap By Its Values And Keys, Find And Remove Duplicate Elements In A List, Count The Frequency Of Elements In A List, Sort An ArrayList In Ascending And Descending Order, Find The Second Largest Distinct Element In A List, Convert An ArrayList To An Array And Back, Merge Two Lists And Remove Duplicates, Find Common Elements Between Two Lists, Iterate Through A HashMap In Different Ways, Find The First Non Repeating Element And First Repeating Element In A List, Group String By Their Length, Find The Highest And Lowest Values In A List, Find The Maximun And Minimum Elements, Reverse A List WithOut Using Another List, Convert List To Map, Remove Element From A List While Iterating, Find The Top Three Highest Numbers, Group String By Their Length, Check Whether Two Lists Are Equal, Sort Custom Employee Objects By Salary, Find Most Frequent Element In A List