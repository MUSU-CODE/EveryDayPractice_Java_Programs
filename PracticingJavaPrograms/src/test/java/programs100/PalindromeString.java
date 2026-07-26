package programs100;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = scn.nextLine();
		String org = str;
		System.out.println("Original String "+ org);
		
		String rev = null;
		for (int i = str.length()-1 ; i>=0 ; i-- )
		{ rev = rev+str.charAt(i); }	
		
		if (org == rev)
		{System.out.println("Palindrom ");}	
		else 
		{System.out.println("not");}

	}

}
