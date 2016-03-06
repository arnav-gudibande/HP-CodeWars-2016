import java.util.*;
import java.io.*;

public class prob06 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String useless = in.nextLine();
		int b = Integer.parseInt(useless);
		for(int i = 0; i<b;i++) {
			String use = in.nextLine();
			String[] beast = use.split(" ");
			double T = (double) Integer.parseInt(beast[0]);
			double T0 = (double) Integer.parseInt(beast[1]);
			double T1 = (double) Integer.parseInt(beast[2]);
			double C0 = (double) (Integer.parseInt(beast[3]))/8;
			double C1 = (double) (Integer.parseInt(beast[4]))/8;
		
			float s = 0;
		
			s = (float) (((C1-C0)/(T1-T0)));
		
			float ans = (float) ((s*T) + ((-s*T0)+C0));
		
			System.out.println(ans);
		}
	}
}