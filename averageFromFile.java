/*
	Java program to calculate average of indefinite
	numbers from a file, terminated by EOF
*/

import java.util.*;

public class averageFromFile {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a,	//a to hold current value
			n=0;	//n to count no values read
		int average=0;
		while(scan.hasNext()) {
			a = scan.nextInt();
			n++;
			average = ((n-1)*average + a)/n; 
		}
		System.out.println("No of values : "+n);
		System.out.println("Sum : "+(n*average));
		System.out.println("Average : "+average);
	}
}