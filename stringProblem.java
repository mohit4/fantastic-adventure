import java.util.Scanner;

public class stringProblem{
	public static void main(String[] args) {
		String s;
		int st,en;
		Scanner scan = new Scanner(System.in);
		s = scan.nextLine();
		st = scan.nextInt();
		en = scan.nextInt();
		if(en-st==st)
			System.out.println("King");
		else if(en-st==0)
			System.out.println(s.substring(st));
	}
}