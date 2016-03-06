import java.util.*;
import java.io.*;

public class prob09 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean b = true;
		while(b){
			String whole = in.nextLine();
			if(whole.equals("0 0 0")) {
				b = false;
				break;
			}
		String[] beast = whole.split(" ");
		int x = Integer.parseInt(beast[0]);
		int y = Integer.parseInt(beast[1]);
		int z = Integer.parseInt(beast[2]);
		
		int SA = (2*(x*y) + 2*(y*z) + 2*(z*x));
		int V = x*y*z;
		
		int unpainted = (x-2)*(y-2)*(z-2);
		
		int painted = V-unpainted;
		
		if(unpainted==painted) {
			System.out.println("A "+x+"x"+y+"x"+z+" block is PERFECT");
		}
		if(painted>unpainted) {
			System.out.println("A "+x+"x"+y+"x"+z+" block is MORE than Perfect");
		}
		if(painted<unpainted) {
			System.out.println("A "+x+"x"+y+"x"+z+" block is LESS than Perfect");
		}
		}
		
	}
}



