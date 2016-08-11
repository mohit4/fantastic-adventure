//program to split a string into mulitple strings

import java.util.Scanner;

public class splitString{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a big string : ");
		String s = scan.nextLine();
		scan.close();
		String[] words = s.split(" ");
		for(String word:words)
			System.out.println(word);
	}
}