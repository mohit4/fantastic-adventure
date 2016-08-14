import java.util.Scanner;

public class demo{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next(), b = "";//scan.next();
		scan.close();
		if(a.compareTo(b)<0)
			System.out.println(a+" "+b);
		else
			System.out.println(b+" "+a);
	}
}