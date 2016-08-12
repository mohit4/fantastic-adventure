import java.util.Scanner;
public class removeWord{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String word = scan.next();
		scan.close();
		while(s.contains(word)){
			s=s.substring(0,s.indexOf(word))+s.substring(s.indexOf(word)+word.length());
		}
		System.out.println(s);
	}
}