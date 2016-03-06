import java.util.*;
import java.io.*;

public class prob05 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String useless = in.nextLine();
		int beast = Integer.parseInt(useless);
		for (int y = 0; y<beast; y++){
		String w = in.nextLine();
		String[] arStr = w.split(" ");
		String n = arStr[0];
		int num = Integer.parseInt(n);
		String word = arStr[1];
		String newStr = "";
		
		for(int i = 0; i<word.length();i++) {
			if(i!=0 && i%num!=0) {
				newStr = newStr + word.substring(i,i+1);
			}			
		}
		System.out.println(newStr + " " + newStr.length());
		}
	}
}


