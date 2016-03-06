import java.util.*;
import java.io.*;

public class Problem14 {
	public static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String o = in.nextLine();
		String[] code = o.split("");
		String[] decode = new String[code.length];
		decode[0] = code[0];
		int prev = 0;
		
		for(int i = 0; i<code.length-1; i++) {
			int value = getCode(code[i]);
			if(i!=0){
				prev = getCode(code[i-1]);
			}
			int b = value+prev;
			if((value+prev) > code.length) {
				b = Math.abs(code.length-b);
			}
			decode[i+1] = code[b];
		}
		
		System.out.println(Arrays.toString(decode));
		
		
	}
	
	
	public static int getCode(String x) {
		int temp = 0;
		for(int i = 0; i<alphabet.length()-1;i++) {
			if(x==alphabet.substring(i,i+1)){
				temp = alphabet.indexOf(x) + 1;
			}
		}
		if(temp%5==0) {
			return 5;
		} 
		if(temp%5!=0) {
			return temp%5;
		}
		return 6;
	}
	
}
