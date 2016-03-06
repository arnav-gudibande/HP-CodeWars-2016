import java.util.*;
import java.io.*;

public class prob08 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String useless = in.nextLine();
		int b = Integer.parseInt(useless);
		for(int raw = 0; raw<b; raw++){
		String whole = in.nextLine();
		int origspaces = whole.length()-1;
		int lines = whole.length()*2-1;
		
		for(int i = 0; i<whole.length(); i++) {
			System.out.println(space(origspaces-i)+whole.substring(0,i+1));
		}
		for(int d = 1; d<whole.length(); d++) {
			System.out.println(whole.substring(d));
		}
		System.out.println();
		}
		
	}
	
	public static String space(int x) {
		String b="";
		for(int i = 0; i<x; i++) {
			b = " "+b;
		}
		return b;
	}
}

