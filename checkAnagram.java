import java.util.Scanner;
import java.util.Arrays;

public class checkAnagram{

	static boolean isAnagram(String a,String b){
		char[] temp1, temp2;
		temp1=a.toCharArray();
		temp2=b.toCharArray();
		Arrays.sort(temp1,0,temp1.length);
		Arrays.sort(temp2,0,temp2.length);
		a = String.copyValueOf(temp1);
		b = String.copyValueOf(temp2); 
		if(a.equals(b))
			return true;
		return false;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 strings : ");
		String a = scan.next(), b = scan.next();
		scan.close();
		//check if they are anagrams
		if(isAnagram(a,b))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}