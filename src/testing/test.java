package testing;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Handler;

public class test {
	public static String HANDLETIME(String s,Time sync){
		String result="";
		// 00:00:50,850 --> 00:00:54,183
		String[] times = s.replace("-->","").split("  ");
		Time fromTime = new Time(times[0]);
		Time toTime   = new Time(times[1]);
		result=fromTime.add(sync)+" --> "+toTime.add(sync);
		
		return result;
		
	}
	public static void main(String[] args) throws IOException{
		
		String s ="00:00:50,850 --> 00:00:54,183";
		String[] ss = s.replace("-->","").split("  ");
		for(String part:ss){
			System.out.println(part);
		}
		Time sync = new Time(0,0,3);
		System.out.println(HANDLETIME(s,sync));
		File file = new File("E:/WORKSPACE/TEST1_OUT.srt");
		BufferedReader br = new BufferedReader(new FileReader("E:/WORKSPACE/TEST.txt"));
		FileWriter fw = new FileWriter(file.getAbsoluteFile());
		String line;
		while((line=br.readLine())!=null){
				String k = HANDLETIME(line,sync);
				System.out.println(line);
				fw.write(k);
				fw.write("\r\n");
			
		}
		System.out.println(sync.add(new Time(0,0,30)));
		
		/*
		String s ="00:00:50,850 --> 00:00:54,183";
		String[] times = s.replace("-->","").split("  ");
		System.out.println(times[0]);
		System.out.println(times[1]);
		System.out.println(times.length); */
		/*
		BufferedReader br = new BufferedReader(new FileReader("E:/WORKSPACE/SAMPLE.srt"));
		String currentLine;
		while((currentLine=br.readLine())!=null){
			System.out.println(currentLine); */
			fw.close();
			br.close();
		}
	}


