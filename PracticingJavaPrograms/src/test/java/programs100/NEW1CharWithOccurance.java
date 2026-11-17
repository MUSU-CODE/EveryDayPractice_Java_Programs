package programs100;

import java.util.Arrays;

public class NEW1CharWithOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "OpenString";
		char chartoreplace = 'n';     //expected output = Ope1Stri2g
		
		//check char presence in string
		if(str.indexOf(chartoreplace) == -1) //when indexOf() doesn't find given character it gve -1 but if found required character it give index num of tht character present
		{
			System.out.println("given character not available in input string");
			System.exit(0);
		}
		
		//logic to replace char occurrence in a string
		int count = 1;
		
		for(int i=0; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			if(ch == chartoreplace)
			{
				str = str.replaceFirst(String.valueOf(chartoreplace), String.valueOf(count)); // str = count;
				count++;
			}
		}
		System.out.println(str);

	}

}
