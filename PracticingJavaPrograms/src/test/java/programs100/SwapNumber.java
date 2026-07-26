package programs100;

import java.util.Scanner;

public class SwapNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Two Numbers");
		
		int num1 = scn.nextInt();
		int num2 = scn.nextInt();
		
		int temp = 0;
		System.out.println("One number we took is "+ num1);
		System.out.println("Another number we took is "+ num2);
		
		System.out.println("After swaping ");
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("One number we took is "+ num1);
		System.out.println("Another number we took is "+ num2);
		
	}

}
