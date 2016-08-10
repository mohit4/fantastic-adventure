import java.util.Scanner;

public class sumOfDigits {
	static int sod(int n) {
		int sum=0;
		if(n<0)
			n=(-n);
		while(n>0){
			sum+=(n%10);
			n/=10;
		}
		return sum;
	}

	static int sodRec(int n) {
		if(n<0)
			n=-n;
		if(n<=9)
			return n;
		return n%10 + sodRec(n/10);
	}

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int t;
		System.out.print("Enter a no : ");
		t = scan.nextInt();
		scan.close();
		System.out.println("Sum of digits : "+sod(t));
		System.out.println("Sum of digits : "+sodRec(t));
	}
}