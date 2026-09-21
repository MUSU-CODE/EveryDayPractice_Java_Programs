package programs100;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoTextFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileWriter fw = new FileWriter("C:\\selenium.txt") ;
		BufferedWriter bw = new BufferedWriter(fw) ;
		
		bw.write("Hi Welcome To Java");
		bw.write("Be Good");
		
		System.out.println("Completed");
		
		bw.close();

	}

}
