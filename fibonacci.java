import java.util.Scanner;

public class fibonacci{

	//recursive function to calculate fibonacci no
	static void printFib(int n) {
		int a,b;
		a=b=1;
		int c,n_=0;
		System.out.print(a+" "+b+" ");
		while(n_<n) {
			n_++;
			c=a+b;
			a=b;
			b=c;
			System.out.print(c+" ");
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter limit : ");
		int n = s.nextInt();
		printFib(n);
	}
}