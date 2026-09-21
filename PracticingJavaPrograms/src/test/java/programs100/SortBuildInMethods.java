package programs100;

import java.util.Arrays;
import java.util.Collections;

public class SortBuildInMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,3,4,6} ;
		System.out.println("Arrays before sorting " +Arrays.toString(arr));
		
		//Approach 1
		Arrays.parallelSort(arr);
		
		//Approach 2
		Arrays.sort(arr);
		
		System.out.println("Arrays after sorting " +Arrays.toString(arr));
		
		// Descending order sorting
		Integer array[] = {1,3,4,6} ; // here we can't write int array[] = {................} as Collections.reverseOrder() can't take primitive data type
		System.out.println("Arrays before sorting " +Arrays.toString(arr));
		
		Arrays.sort( array, Collections.reverseOrder() );
		
		System.out.println("Arrays after sorting " +Arrays.toString(array));

	}

}
