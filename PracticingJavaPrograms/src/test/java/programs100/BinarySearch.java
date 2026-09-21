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
		
		System.out.println( "element found at " +Arrays.binarySearch(arr, 30) );
	}

}
