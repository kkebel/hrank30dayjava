import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day3 {

	static final Scanner scan = new Scanner(System.in);

	static void Solve(int N){

		if ((N % 2) != 0) {
			System.out.println("Weird");
		}
		else if ((N >= 2) && (N <= 5)){
			System.out.println("Not Weird");
		}
		else if ((N >= 6) && (N <= 20)){
			System.out.println("Weird");
		}
		else if (N > 20) {
			System.out.println("Not Weird");
		}
	}

	public static void main(String[] args) {

		int N = scan.nextInt();

		Solve(N);

		scan.close();

	}

}
