import java.util.Scanner;

public class deleteAllVowels{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		scan.close();
		//removing all the vowels
		StringBuilder sb = new StringBuilder(s);
		for(int i=0;i<sb.length();i++)
			switch(sb.charAt(i)){
				case 'a': case 'A':
				case 'e': case 'E':
				case 'i': case 'I':
				case 'o': case 'O':
				case 'u': case 'U':
					sb.deleteCharAt(i);
					i--;
			}
		System.out.println(sb.toString());
	}
}