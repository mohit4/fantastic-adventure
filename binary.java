import java.util.Scanner;

public class binary{

	//recursive function to print binary no
	static void printBin(int n){
		if(n==1||n==0){
			System.out.print(n);
			return;
		}
		int r = n%2;
		printBin(n/2);
		System.out.print(r);
	}

	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a no : ");
		printBin(s.nextInt());
		System.out.println();
		s.close();
	}
}