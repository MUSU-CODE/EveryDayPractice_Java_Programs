package programs100;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
		System.out.println("Put your String");
		String s = scn.nextLine();
		System.out.println(s);
		
		int Firstcharacter = 0 ;
		int Lastcharacter = s.length() - 1;
		
		for(int i = Lastcharacter ; i >= 0 ; i--)
		{
		    System.out.print(s.charAt (i));
		}
	}
}

