import java.io.*;
import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;
import java.security.*;
import java.util.concurrent.*;

public class Day3 {

	static void totalCost(double meal_cost, int tip_percent, int tax_percent){
		double total_meal_cost = meal_cost + (meal_cost*(tip_percent*0.01)) + (meal_cost*(tax_percent*0.01));
		System.out.println("Total meal cost is $" + (int) Math.round(total_meal_cost));

	}

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		double meal_cost = scan.nextDouble();
		scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int tip_percent = scan.nextInt();
		scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int tax_percent = scan.nextInt();
		scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		totalCost(meal_cost, tip_percent, tax_percent);
		
		scan.close();
	
	}


}
