import java.util.*;

public class gcd {

	static int max(int a,int b){
		return (a>b)?a:b;
	}

	static int min(int a,int b){
		return (a<b)?a:b;
	}

	static int getGCD(int a,int b) {
		if(a==1)
			return b;
		if(b==1)
			return a;
		int temp=a;
		a = max(a,b);
		b = min(temp,b);
		int c = a-(a/b)*b;
		if(c==0)
			return b;
		return getGCD(b,c);
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