import java.util.*;
import java.io.*;

public class prob02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean b = true;
		while(b){
			int orig = in.nextInt();
			if(orig==0){
				b = false;
				break;
			}
			int ans = 10000/orig;
			System.out.println(orig+" gallons per week will last " + ans+ " weeks");
		}
	}
}

