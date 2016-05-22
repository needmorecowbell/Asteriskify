package musciano.adam.asteriskify;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Driver {
	public static void main(String[] args) throws FileNotFoundException{
		
		Scanner in = new Scanner(new FileReader("files/in.txt"));
		PrintWriter out= new PrintWriter(new File("files/out.txt"));
		
		while(in.hasNextLine()){
			String s= in.nextLine();
			System.out.println(s);
			for(int x=0;x<s.length();x++){
				//System.out.println("Entered for loop, charAt(x)= "+s.charAt(x));
				if(Character.isLetterOrDigit(s.charAt(x))){
					
					out.print("*");
				}else{
					out.print(s.charAt(x));
				}
			}
			out.println();
			
			
		}
		in.close();
		out.close();
		System.out.println("Finished");
	}
}
