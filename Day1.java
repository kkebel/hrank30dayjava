import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day1 {

	public static void main (String[] args) {
		int i = 4;
		double d = 4.0;
		String s = "Hacker Rank ";
		
		Scanner scan = new Scanner(System.in);

		int j;
		double e;
		String t;

		//read int, double and string from stdin
		j = scan.nextInt();
		e = scan.nextDouble();
		scan.nextLine();
		t = scan.nextLine();

		scan.close();

		System.out.println("Sum of ints = " + (i + j));
		System.out.println("Sum of doubles = " + (d + e));
		System.out.println(s + t);

	}
}
 
