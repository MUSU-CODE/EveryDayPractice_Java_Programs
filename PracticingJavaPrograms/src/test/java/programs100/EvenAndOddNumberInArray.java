package programs100;

public class EvenAndOddNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,3,4} ;
		
		int evenCount = 0;
		int oddCount = 0;
		
		/* for(int i = 0 ; i <= a.length -1 ; i++)
		{ if(a[i] % 2 == 0)
			{System.out.println(a[i] + " even");
			evenCount++ ; 
			}
		else {System.out.println(a[i] + " odd");
		      oddCount++ ;
		     }
		} */
		
		for (int value : a) {
			{ if(value % 2 == 0)
		     {System.out.println(value + " even");
		      evenCount++ ; 
		      }
	          else {System.out.println(value + " odd");
	           oddCount++ ; }
	         }
		}
		
		System.out.println("even total " + evenCount);
		System.out.println("odd total " + oddCount);

	}

}




/* import java.util.*;

public class Main {
    public static void main(String[] args) {
      System.out.println("Hello, World!");

      Scanner scn = new Scanner(System.in);
	      System.out.println("Enter number in array");
	      int arr[] = new int[10];
	      for(int i=0; i<=arr.length-1; i++)
	      {
	        arr[i] = scn.nextInt();
	      } 
	      System.out.println("SO THE FINAL RESULT IS " + Arrays.toString(arr)); 
        
        for (int j = 0; j<=arr.length-1 ; j++)
       { if (iseven(arr[j]))
         {System.out.println("even " +arr[j]);}
         else
         {System.out.println("odd " +arr[j]);}
       }

      }

      private static boolean iseven(int num) {
       
       if (num%2==0)
       {return true ; }
       else
       {return false ; }
      }
   
} */




/*import java.util.*;

public class Main {
    public static void main(String[] args) {
      System.out.println("Hello, World!");

      //int a[] = userinput(3);
      
      //OR
      
      //Scanner scn = new Scanner (System.in) ;
        System.out.println("Enter Size " );
        int size = scn.nextInt() ;
        int a[] = userinput(size) ;

      
      printarr(a);
      
      findEvenAndOddFromArray(a);
      
    }

    private static int[] userinput(int size)
    {
       Scanner scn = new Scanner (System.in);
       System.out.println("Enter user");
       int arr[] = new int[size] ;
       for (int i=0; i<=arr.length-1; i++)
       {
         arr[i] = scn.nextInt();
       }
       return arr;
    }

    private static void printarr(int a[] )
    {
      //int a[] = userinput();//
      System.out.println("Array is " +Arrays.toString(a));
    }

    private static void findEvenAndOddFromArray(int a[])
    {
        String even = "";
        String odd = "";
       for(int i = 0; i <= a.length - 1; i++)
      {
        if(a[i] % 2 == 0)
       {
         even = even + a[i] + ",";
       }
        else
       {
         odd = odd + a[i] + ",";
       }
      }
        System.out.println("even: " + even.substring(0, even.length() - 1));
        System.out.println("odd: " + odd.substring(0, odd.length() - 1));
    }   
} */