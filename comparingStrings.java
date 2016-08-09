import java.util.*;

public class comparingStrings {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Exception ex = new Exception("Input not given!");
		try {
			String A = scan.nextLine();
			String B = scan.nextLine();
			if(A.length() == 0 || B.length() == 0)
				throw ex;
			//now we compare these strings
			int res1 = A.compareTo(B);
			System.out.println("A compared to B : "+res1);
			int res2 = B.compareTo(A);
			System.out.println("B compared to A : "+res2);
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}