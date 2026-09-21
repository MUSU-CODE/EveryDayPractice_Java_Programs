package programs100;

import java.util.Arrays;

public class CheckEqualityInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,3,2,4};
		int m[] = {1,2,3,4};
		
		//1st Approach
		
		/* boolean status = Arrays.equals(a, m) ;
		if (status ==true) {System.out.println("Arrays equal");}
		else {System.out.println("nah");} */
		
		//2nd Approach
		
		boolean status = true ;
		if (a.length == m.length)
		{
			for(int i=0 ; i<a.length ; i++)
			{if (a[i] != m[i]) 
				{ status = false ; 
				  break ;
				}
			} 
		}
		if(status==true) {System.out.println("yes");}
		else {System.out.println("nah");} 
	}
}




/* import java.util.*;

public class Main {
    public static void main(String[] args) {
      System.out.println("Hello, World!");

        Scanner scn = new Scanner (System.in) ;

        System.out.println("Enter Size " );
        int size1 = scn.nextInt() ;
        int a1[] = userinput1(size1) ;

        System.out.println("Enter Size " );
        int size2 = scn.nextInt() ;
        int a2[] = userinput1(size2) ;

      
      printarr1(a1);
      printarr2(a2);
      
  }

    private static int[] userinput1(int size1)
    {
       Scanner scn = new Scanner (System.in);
       System.out.println("Enter user");
       int arr1[] = new int[size1] ;
       for (int i=0; i<=arr1.length-1; i++)
       {
         arr1[i] = scn.nextInt();
       }
       return arr1;
    }

    private static int[] userinput2(int size2)
    {
       Scanner scn = new Scanner (System.in);
       System.out.println("Enter user");
       int arr2[] = new int[size2] ;
       for (int i=0; i<=arr2.length-1; i++)
       {
         arr2[i] = scn.nextInt();
       }
       return arr2;
    }

    private static void printarr1(int a1[] )
    {
      System.out.println("Array is " +Arrays.toString(a1));
    }

    private static void printarr2(int a2[] )
    {
      System.out.println("Array is " +Arrays.toString(a2));
    }

  } */
