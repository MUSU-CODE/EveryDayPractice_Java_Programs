package programs100;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataFromATextFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Approach 1 : Using FileReader and BufferReader
		
		/* String str ; 
		FileReader fr = new FileReader ("C:\\selenium.txt");
		BufferedReader br = new BufferedReader (fr);
		while( (str=br.readLine()) != null )
		{ System.out.println(str); }
		br.close(); */
		
		
		//Approach 2 : Using Scanner and File
		
		File fl = new File("C:\\selenium.txt") ;
		Scanner sc = new Scanner (fl) ;
		
		while (sc.hasNextLine()) { System.out.println(sc.nextLine()); }
		
		// sc.useDelimiter("\\Z");  System.out.println(sc.next());

	}

}
