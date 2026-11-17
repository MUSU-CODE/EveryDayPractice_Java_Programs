package programs100;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {21, 27, 30}; //In this search it take one element and compare it everybody
		int search = 30;
		
		//String arr[] = {"a", "b", "c"};
		//String search = "a";
		
		boolean flag = false;
		
		for(int i=0; i<arr.length; i++)
		{
			//System.out.print(" "+arr[i]);
			
			//if(arr[i].equals(search)) // for string
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




/* import java.util.*;

public class Main {
    public static void main(String[] args) {
      System.out.println("Hello, World!");

      int a[] = {1,10,11,16} ;
      int search = 16 ;
      int at = 0 ;
      boolean flag = false;
      
      for(int i=0; i<a.length ; i++)
      {
        if(a[i] == search)
        {flag=true ;
        at = i ;
        break;}
      }

      if (flag=true)
      {System.out.println("found at " +at);}
      else
      {System.out.println("nh");}

    }
} */