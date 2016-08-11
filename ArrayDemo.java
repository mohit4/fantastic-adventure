import java.util.Scanner;
import java.util.Arrays;

public class ArrayDemo{

	static void println(String s){
		System.out.println(s);
	}

	static void print(String s){
		System.out.print(s);
	}

	static void printArr(int[] a){
		for(int i:a)
			print(i+" ");
		println("");
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		print("Enter no of values : ");
		n = scan.nextInt();
		int[] arr = new int[n];
		println("Enter "+n+" values : ");
		for(int i=0;i<n;i++)
			arr[i]=scan.nextInt();
		scan.close();
		//using Arrays class
		Arrays.sort(arr);
		println("Sorted array : ");
		printArr(arr);
		println("Found 10 at index "+Arrays.binarySearch(arr,10));
		int[] newArr = new int[6];
		newArr = Arrays.copyOf(arr,arr.length);
		println("Copied data to another array!");
		printArr(newArr);
		println("Changed the array, new data : ");
		Arrays.fill(arr,10);
		printArr(arr);
	}
}