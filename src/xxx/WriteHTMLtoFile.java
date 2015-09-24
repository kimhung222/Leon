package xxx;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class WriteHTMLtoFile {
	public static void main(String[] args) throws IOException{
		int linenumber = 0;
		 URL link = new URL("http://store.steampowered.com/app/264710/");
		 File file = new File("D:/file1.txt");
		 FileWriter fw = new FileWriter(file);
		 BufferedWriter bw = new BufferedWriter(fw);
		 BufferedReader in = new BufferedReader(new InputStreamReader(link.openStream()));
		 while((in.readLine())!=null){
		  bw.write(in.readLine());
		  bw.write("\n");		
		 }
		 System.out.println("Completed!");
		bw.close();
		in.close();
		}
}

