import java.util.Scanner;
import java.util.Arrays;

public class sortStringChars{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String s = scan.next();
		scan.close();
		char[] temp = s.toCharArray();
		Arrays.sort(temp,0,temp.length);
		s = String.copyValueOf(temp);
		System.out.println("New String is : "+s);
	}
}