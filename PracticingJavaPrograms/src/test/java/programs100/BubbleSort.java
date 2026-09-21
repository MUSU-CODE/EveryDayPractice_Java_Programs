package programs100;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {20 , 27 , 28 ,30 , 1};
		System.out.println("Arrays before sorting " +Arrays.toString(arr));
		
		int length = arr.length;
		
		for(int i=0; i< length-1; i++) //Number of passes
		{
			for(int j=0; j< length-1; j++ ) //Iteration in each pass
			{
				if(arr[j] > arr[j+1])
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
