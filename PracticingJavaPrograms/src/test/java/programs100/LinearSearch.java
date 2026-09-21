package programs100;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {21, 27, 30}; //In this search it take one element and compare it everybody
		int search = 30;
		
		boolean flag = false;
		
		for(int i=0; i<arr.length; i++)
		{
			//System.out.print(" "+arr[i]);
			
			if(arr[i]==search)
			{System.out.println("found element " +arr[i] +" at " +i);
			  flag = true;
			  break;
			}
		}

		if (flag == false)
		{System.out.println("nh");}
	}

}
