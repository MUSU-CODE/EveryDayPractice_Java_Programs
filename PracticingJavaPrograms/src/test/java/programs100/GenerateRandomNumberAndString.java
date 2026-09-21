package programs100;

import java.util.Random;

public class GenerateRandomNumberAndString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		//1st Approach
		Random run = new Random();
		int run_num = run.nextInt(100);
		System.out.println(run_num);
		
		//2nd Approach
		System.out.println(Math.random());
		
		//3rd Approach
		String num = RandomStringUtils.randomNumeric(14);
		System.out.println(num);
		
		String str = RandomStringUtils.randomAlphabetics(12);
		System.out.println(str);
	}

}
