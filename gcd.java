import java.util.*;

public class gcd {

	static int getGCD(int a,int b) {
		a = (a>)
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a,b;
		a = scan.nextInt();
		b = scan.nextInt();
		scan.close();
		int gcd = getGCD(a,b);
		System.out.println("The GCD of "+a+" and "+b+" is "+gcd);
	}
}