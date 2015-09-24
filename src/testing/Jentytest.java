package testing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Jentytest {
	public static String REPLACEWHITESPACE(String s){
		while(s.charAt(0)==' ')
			s=s.substring(1);
		return s;
	}
	public static void main(String[] args) throws IOException{
		String link ="http://store.steampowered.com/app/363440/";
		URL url;
		BufferedReader br = null;
		try {
			url = new URL(link);
			URLConnection conn = url.openConnection();
			br = new BufferedReader( new InputStreamReader( conn.getInputStream()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        String inputLine;
        while((inputLine=br.readLine())!=null){
        	
        	
        }
		
	
}
}

