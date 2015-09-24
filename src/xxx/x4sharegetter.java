package xxx;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class x4sharegetter {
	
	public static String STANDARDLIZE(String s){
		int i = 0;
		if(s.equals(""))
			return s;
		while(s.charAt(0)==' '){
			s=s.substring(1);
		}
		return s;
	} 
	public static void main(String[] args) throws IOException{
		String link ="http://4share.vn/d/457177707776747c";
		URL url = new URL(link);
		URLConnection conn = url.openConnection();
		BufferedReader br  = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		String inputLine;
		String x ="";
		while((inputLine=br.readLine())!=null){
			if(inputLine.contains("style="+"'"+"margin-top: 10px;margin-left: 20px; " +
					"border: 1px solid #ccc; padding: 8px; display: none"+"'"+">")){		
				 x = inputLine.replace("style="+"'"+"margin-top: 10px;margin-left:" +
				 		"20px; border: 1px solid #ccc; padding: 8px; display: none"+"'"+">","");
				 break;
			}	
		}
		String parts[] = x.replace("</div>        </div>","").split("  <br/>");
		parts[0] = STANDARDLIZE(parts[0].replace("               style='margin-top: 10px;margin-left: 20px; border: 1px solid #ccc; padding: 8px; display: none'> ", ""));
		for(int i=1;i<=parts.length-1;i++){
			System.out.println("<p style=\"text-align: center;\"><a href=\""+parts[i-1]+"\"target=\"_blank\">" +
					"<strong><span style=\"font-size: 20px;\">PART "+i+"</span></strong></a></p>");		
		}
		br.close();
	}
}
