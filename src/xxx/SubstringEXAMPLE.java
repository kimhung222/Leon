package xxx;

public class SubstringEXAMPLE {
	public static void main(String[] args){
		//String Currentline = "<link rel=\"image_src\" href=\"http://cdn.akamai.steamstatic.com/steam/apps/271590/header.jpg?t=1434402788\">";
		//System.out.println(Currentline.substring(28, Currentline.length()-3));
		String s1 = "http://store.steampowered.com/app/271590/";
		String s2 ="ss_ea78dfa1d7d81c3781287cab165f64ca70f1f2ea.jpg";
		String s3="http://cdn.akamai.steamstatic.com/steam/apps/271590/ss_ea78dfa1d7d81c3781287cab165f64ca70f1f2ea.116x65.jpg?t=1434402788";
	    String STANDARD ="http://cdn.akamai.steamstatic.com/steam/apps/";
	    STANDARD = STANDARD + s1.substring(34) + s2;
	    System.out.println(STANDARD);
	}

}
//http://store.steampowered.com/app/271590/
//ss_ea78dfa1d7d81c3781287cab165f64ca70f1f2ea.jpg
//http://cdn.akamai.steamstatic.com/steam/apps/271590/ss_ea78dfa1d7d81c3781287cab165f64ca70f1f2ea.116x65.jpg?t=1434402788