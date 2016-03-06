import java.util.*;
import java.io.*;

public class prob03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String useless = in.nextLine();
		int num = Integer.parseInt(useless);
		
		for(int y = 0; y<num; y++){
				String word = in.nextLine();
				String[] x = new String[word.length()];
				for(int b = 0; b<word.length(); b++) {
					x[b] = word.substring(b,b+1);
				}
			
				boolean matches = false;
					
				for(int i = 0; i<x.length-1;i++) {
					if(x[i].equals(x[i+1])) {
						matches = true;
						break;
					}
				}
		
				if(matches==true) {
					System.out.println("likes " + word);
				} else if(matches == false) {
					System.out.println("hates " + word);
				}
			}
	}
}