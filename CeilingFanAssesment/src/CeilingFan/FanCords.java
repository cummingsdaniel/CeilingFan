package CeilingFan;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * 
 * @author Dan Cummings
 * Medavie BlueCross coding assessment
 * This is the main class 
 */
public class FanCords {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Fan cord = new Fan();
		while(true) {
			System.out.println("\nPRESS 1 THAN ENTER FOR FIRST CORD \\nOR PRESS 2 THEN ENTER FOR SECOND CORD.");
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			int n = Integer.parseInt(in.readLine());
			if(n == 1) {
				cord.pullChord1();
			}
			else if(n == 2) {
				cord.pullChord2();
			}
			
		}
	}

}
