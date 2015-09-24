package xxx;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class GETHTMLFILE {
	public static void main(String[] args) throws IOException{
		URL url;
		url = new URL("http://linkneverdie.com/GamesDetail/?gameseriesId=82&ten=Devil+May+Cry+3%3a+Dante%27s+Awakening-Special+Edition+2006");
		URLConnection conn = url.openConnection();
		BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		String inputline;
		String fileName = "D:/dmc.html";
		File file = new File(fileName);
		FileWriter fw = new FileWriter(file.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);
		while((inputline = br.readLine())!=null){
			bw.write(inputline);
			bw.write("\n");
		}
	//	System.out.println("Complete!");
		bw.close();
		br.close();
		BufferedReader br1 = new BufferedReader(new FileReader(fileName));
		String currentLine;
		int count = 0;
		String result="";
		while((currentLine=br1.readLine())!=null){
			++count;
		if(count==543){
		//	System.out.println(currentLine);
			result = currentLine;
		}
		}
		String[] parts = result.split("<strong><span style=\"font-size: 20px;color: #B45F06;\">SYSTEM REQUIREMENTS</span></strong></p><p style=\"text-align: center;\"><span style=\"font-size: 20px;\"><br></span></p>");
		for(String part : parts){
			System.out.println(part);
		}
		br1.close();
		
	}
	
	

}
