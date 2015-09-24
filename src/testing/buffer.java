package testing;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class buffer {
	public static void main(String args[]) throws IOException{
		File output  = new File("E:/batman.srt");
		File input   = new File("E:/Source.srt");
		FileWriter fw = new FileWriter(output);
		BufferedWriter bw = new BufferedWriter(fw);
		FileInputStream fin = new FileInputStream(input);
		DataInputStream ds = new DataInputStream(fin);
		BufferedReader br = new BufferedReader(new InputStreamReader(ds));
		String line;
		while((line=br.readLine())!=null)
			System.out.println(line);
		
		
	}

}
