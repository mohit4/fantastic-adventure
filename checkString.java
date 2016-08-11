//program to check if a string exists into another,
//if so, then return the address of it

import java.util.Scanner;

public class checkString{
	public static void main(String[] args) {
		
		String data = "lorem ipsum dolar sit amet";

		Scanner scan = new Scanner(System.in);
		String s = "";
		System.out.println("Search for : ");
		s = scan.next();
		scan.close();
		if(data.contains(s))
			System.out.println("Found at "+data.indexOf(s));
		else
			System.out.println("Not found!");
	}
}