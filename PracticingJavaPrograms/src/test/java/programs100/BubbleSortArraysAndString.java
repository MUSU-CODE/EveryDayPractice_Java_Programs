package programs100;

import java.util.Arrays;

public class BubbleSortArraysAndString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {20 , 27 , 28 ,30 , 1};
		System.out.println("Arrays before sorting " +Arrays.toString(arr));
		
		//String arr[] = {"Mousumi", "Ankit", "Raja", "Priya", "Amit"};
        //System.out.println("Before Sorting : " + Arrays.toString(arr));
		
		for(int i=0; i< arr.length-1; i++) //Number of passes
		{
			for(int j=0; j< arr.length-1; j++ ) //Iteration in each pass
			{
				//if (arr[j].compareTo(arr[j + 1]) > 0) //Compare two adjacent strings alphabetically      //OR//   if(arr[j].compareToIgnoreCase(arr[j+1]) > 0)
				if(arr[j] > arr[j+1]) // as we're doing [j+1] so till end if we go then arrayoutofboundexception will be there thts why we take arr.length-1
				{
					int temp = arr[j] ;
					arr[j] = arr[j+1] ;
					arr[j+1] = temp ;
				}
			}
		}
		
		System.out.println("Array after sorting " +Arrays.toString(arr));
	}

}
//we can reverse an array using bubble sort