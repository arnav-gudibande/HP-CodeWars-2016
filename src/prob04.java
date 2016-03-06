import java.util.*;
import java.io.*;

public class prob04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String whole = in.nextLine();
		String[] tem = whole.split(" ");
		double B = Double.parseDouble(tem[0]);
		int E = Integer.parseInt(tem[1]);
		String temp = whole.substring(whole.length()-1, whole.length());
		
		double ans = (double) (B*(Math.pow(10.0, E)));
		double d = (double) ans*100;
		double x = (double) d/100;
		float tempx = (float) x;
		
		double newTempX = ((int) (tempx*100))/100;
		System.out.println(newTempX);
	}
}
