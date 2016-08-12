import java.util.Scanner;

public class abbreviateName{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s[];
		System.out.println("Enter your complete name : ");
		s = scan.nextLine().split(" ");
		scan.close();
		int i;
		for(i=0;i<s.length-1;i++){
			System.out.print(s[i].substring(0,1).toUpperCase()+". ");
		}
		System.out.println(s[i]);
	}
}