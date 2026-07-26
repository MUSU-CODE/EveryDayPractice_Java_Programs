package programs100;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num = scn.nextInt();
		int org = num;
		System.out.println("Number originally "+ org);
		
		int rev = 0;
		while (num>0)
		{ rev = rev*10 + num%10;
		  num = num/10;
		}
		
		if (org == rev)
		{System.out.println("Number is palindrome");}
		else {System.out.println("not");}
	}

}
