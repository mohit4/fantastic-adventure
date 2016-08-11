import java.util.Scanner;

public class average{
	public static void main(String[] args) {
		int[] values;
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter no of entries: ");
		n = s.nextInt();
		values = new int[n];
		//now we get the values
		for(int i=0;i<n;i++)
			values[i]=s.nextInt();
		s.close();
		//calculating the sum of values
		double sum=0.0;
		for(int i=0;i<n;i++)
			sum+=values[i];
		double average = sum/n;
		System.out.println("The average is "+average);
	}
}