import java.util.Scanner;
public class checkSplit{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		scan.close();
		String[] words = s.split(" ");
		System.out.println(words.length);
		for(String x:words)
			System.out.println(x);
	}
}