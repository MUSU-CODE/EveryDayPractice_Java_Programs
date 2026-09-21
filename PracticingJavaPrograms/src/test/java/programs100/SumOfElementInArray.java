package programs100;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*  Scanner scn = new Scanner(System.in);
	      System.out.println("Enter String in array");
	      String arr[] = new String[3];
	      for(int i=0; i<=arr.length-1; i++)
	      {
	        arr[i] = scn.nextLine();
	      }
	      System.out.println("SO THE FINAL RESULT IS " + Arrays.toString(arr)); */
		
		
		
		
		 /* Scanner scn = new Scanner(System.in);
	      System.out.println("Enter number in array");
	      int arr[] = new int[3];
	      for(int i=0; i<=arr.length-1; i++)
	      {
	        arr[i] = scn.nextInt();
	      } 
	      System.out.println("SO THE FINAL RESULT IS " + Arrays.toString(arr)); */
		
		int a[] = {1,2,3,4};
		int sum = 0;
		
        /*for(int i = 0 ; i <= a.length-1 ; i++)
        {sum = sum+a[i] ; }*/
        
        for (int value : a)
        {sum = sum+value ;}
        
        System.out.println(sum);
	}

}
