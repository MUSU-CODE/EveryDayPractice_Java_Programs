package programs100;

public class LoveBabbar2DArraySumOfAllTheElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][] = { {1,2,3},{1,2} };
		int sum = 0;
		int multiply = 1;
		int maxValue = arr[0][0];
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				int value = arr[i][j] ;
				sum = sum + value ;
				
			}
		}
		System.out.println(sum);
		
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				int value = arr[i][j];
				multiply = multiply*value;
			}
		}
		System.out.println(multiply);
		
		//find max
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				if(arr[i][j] > maxValue)
				{ maxValue = arr[i][j]; }
			}
		}
		System.out.println(maxValue);

	}

}
