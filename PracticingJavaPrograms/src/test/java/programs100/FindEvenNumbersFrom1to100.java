package programs100;

import java.util.Scanner;

public class FindEvenNumbersFrom1to100 {
	
        public static void main(String[] args) {
            
         Scanner scn = new Scanner(System.in);
		 System.out.println("Put your Number");
		 int s = scn.nextInt();
		 System.out.println(s);   
            
	    //int count = 0;
	    
	    if(s >= 0  && s <=100){
	    
		//for(int i = 1 ; i <= 100 ; i++)
		//{
		    if (s%2 == 0 )
		    //{count ++ ;}
		    //else {System.out.println(i + "odd");}
		//}
		//System.out.println(count);
		System.out.println(s + "even");
	    }
	    
	    else {System.out.println("out of given boundary");};
	}
}
