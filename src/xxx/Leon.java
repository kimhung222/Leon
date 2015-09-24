package xxx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Leon {
	public static void main(String[] args) throws IOException{
		int linenumber = 0;
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
	   String line;
	   while((line = stdin.readLine()) !=null && line.length()!=0){
		   System.out.println();
		   System.out.print(line);
		   linenumber++;
	   } 
	   System.out.println(linenumber);
	   System.out.println("Your Assignment complete!");
		
	}

}
