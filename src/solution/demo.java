package solution;

import java.util.Scanner;

public class demo {
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	int link_num = 3;
	Link link[] = new Link[link_num];
	System.out.println("Link plz :");
	for(int i=0;i<link_num;i++){
		Link temp = new Link();
		temp.URL = input.nextLine();
		link[i] = temp;
		if(link[i].URL.contains("4share")){
			link[i].Type = "4SHAREVN";
		}
		if(link[i].URL.contains("fshare")){
			link[i].Type = "FSHARE";
		}
		else{
			System.out.println("Vui lòng nhập loại Link của link thứ "+i);
			link[i].Type = input.nextLine();
		}


}
	System.out.println("Sucess");
}
}
