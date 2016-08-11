//import java.util.Scanner;
import java.util.*;

public class sine {
	
	static int fact(int n) {
		if(n==1)
			return n;
		return n*fact(n-1);
	}

	static double sineOfx(int x,int n) {
		double res=0.0;
		for(int i=0,k=1;i<n;i++,k+=2) {
			res+=(Math.pow(-1,i)*Math.pow(x,k)/fact(k));
		}
		return res;
	}

	public static void main(String[] args) {
		//to be done
		Scanner s = new Scanner(System.in);
		System.out.println("Enter x : ");
		int x = s.nextInt();
		s.close();
		System.out.println("Sin(x) is "+sineOfx(x,5));
	}
}