package programs100;

import java.util.Scanner;

public class LoveBabbar2DArrayBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr = new int[3][4] ;
		int[][] brr = { {1,2},{3,4},{5,6},{1,2,3,4,5,6,7} } ;
		
		/*System.out.println(brr[3][1]);*/
		
		//print code
		int rowLength = brr.length;
		
		for(int rowIndex=0; rowIndex<=rowLength-1; rowIndex++)
		{
			int colmnLength = brr[rowIndex].length;
			
			for(int colmnIndex=0; colmnIndex<=colmnLength-1; colmnIndex++)
			{
				System.out.print(brr[rowIndex][colmnIndex] + " ");
			}
			System.out.println();
		}
		
		//Approach 2
		int arr1[][] = new int [3][4] ;
		Scanner scn = new Scanner(System.in);
		
		for(int i=0; i<=arr.length-1; i++)
		{
			for(int j=0; j<=arr[i].length-1; j++)
			{
				System.out.println("Provide value for row = "+i+" and column = "+j);
				arr[i][j] = scn.nextInt();
			}
		}
        int rowLengthOK = arr.length;
		
		for(int rowIndex=0; rowIndex<=rowLengthOK-1; rowIndex++)
		{
			int colmnLengthOK = arr[rowIndex].length;
			
			for(int colmnIndex=0; colmnIndex<=colmnLengthOK-1; colmnIndex++)
			{
				System.out.print(brr[rowIndex][colmnIndex] + " ");
			}
			System.out.println();
		}

	}

}
