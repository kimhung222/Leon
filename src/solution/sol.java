package solution;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class sol {
	String x = "aaa";
	String y = "bbb";

	public static String STANDARD(String s){
		while(s.charAt(0)==' '){
			s = s.substring(1);	
		}
		return s;
	}

    public static String EXTRACT(String source,String core){
    	String[] replacements ={"<li>","</li>","<br>","<ul class=\"bb_ul\">","<strong>","</br>","</strong>","</ul>","Supported"};
    	source = source.replace(core,"");
    	for(String replacement : replacements){
    		source= source.replace(replacement, "");
    	}
    	return STANDARD(source);
    }
	public static void main(String[] args) throws IOException{
		//String s ="<li><strong>Processor:</strong> 2 GHz</li>"     ;
		//s = s.replace("<li><strong>","").replace("</strong>","").replace("</li>","");
		//System.out.println(s);
	    //String hhh = "      I am batman";
		//System.out.println(hhh);
		//System.out.println(STANDARD(hhh));
		File file = new File("D:/file1.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String Currentline;
		while((Currentline = br.readLine())!= null){
			if(Currentline.contains("OS:")){
				Currentline = EXTRACT(Currentline,"OS:");
				break;
			}
		}
		System.out.println(Currentline);
		br.close();
	}

}
