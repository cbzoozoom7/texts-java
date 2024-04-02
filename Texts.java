import java.util.*;
import java.io.*;
public class Texts {
	public static void main (String[] args) throws IOException {
		Scanner myScanner = new Scanner(new File("texts.dat"));
		while (true) {
			String line = myScanner.nextLine();
			String output = "";
			if (line.equals("")) {
				break;
			} else {
				for (int a=0;a<line.length();a++) {
					if (line.substring(a, a+1).equalsIgnoreCase("A") || line.substring(a, a+1).equalsIgnoreCase("E") || line.substring(a, a+1).equalsIgnoreCase("I") || line.substring(a, a+1).equalsIgnoreCase("O") || line.substring(a, a+1).equalsIgnoreCase("U")) {
					} else {
						output = output + line.substring(a, a+1);
					}
				}
				System.out.println(output);
			}
		}
		System.out.println("Ignore that error.");
	}
}