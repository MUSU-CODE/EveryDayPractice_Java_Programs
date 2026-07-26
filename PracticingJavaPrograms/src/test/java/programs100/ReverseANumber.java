package programs100;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter A Number");
		
		int num = scn.nextInt();
		
		int rev = 0 ;
		
		while (num>0) 
		{ rev = rev*10 + num%10 ;
		  num = num/10 ;
		}

		System.out.println("Reverse Number is" + rev);
	}

}
