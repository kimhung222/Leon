package xxx;


import java.net.*;
import java.io.*;
public class GetHTML {
    public static void main(String[] args) throws Exception {

        URL oracle = new URL("" +
        		"http://linkneverdie.com/GamesDetail/?gameseriesId=&ten=Victor+Vran+2015");
        BufferedReader in = new BufferedReader(
        new InputStreamReader(oracle.openStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
        in.close();
    }
}