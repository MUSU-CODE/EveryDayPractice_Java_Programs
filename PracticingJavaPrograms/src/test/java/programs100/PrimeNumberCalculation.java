package programs100;

public class PrimeNumberCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 6;
		int count = 0;
		if (num>0)
		{
			for (int i = 1 ; i <= num ; i++)
			{if (num%i == 0)
				{count++ ;}
			}
			
			if(count == 2) {System.out.println("prime");}
			else {System.out.println("not prime");}
			
		}
		else
		{System.out.println("not prime");}
	}

}

/* import java.util.*;

public class Main {
    public static void main(String[] args) {
      System.out.println("Hello, World!"); 
      
      for (int i = 1 ; i<= 100 ; i++)
      {
        if(isprime(i))
        {System.out.println(i);}
      }
    }
    
      public static boolean isprime(int num) {
      int count = 0;
      for(int j=1; j<=num; j++)
      {
        if(num%j == 0) {count++ ; }
      }
      if (count == 2)
      {return true ;}
      else{return false ;}

    }
} */