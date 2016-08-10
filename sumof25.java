public class sumof25 {

	static int func(int n) {
		if(n==0)
			return 0;
		return n+func(n-1);
	}

	public static void main(String[] args) {
		System.out.println("Sum of first 25 natural nos is "+func(25));
	}
}