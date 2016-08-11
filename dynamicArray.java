import java.util.*;

public class dynamicArray{
	
	static void printArr(int[] arr){
		for(int i:arr)
			System.out.print(i+" ");
		System.out.println();
	}

	public static void main(String[] args) {
		int n;
		int[] arr,newArr;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no of values : ");
		n = scan.nextInt();
		arr = new int[n];
		System.out.println("Enter "+n+" values : ");
		for(int i=0;i<n;i++)
			arr[i]=scan.nextInt();
		printArr(arr);
		System.out.println("Enter additional no of values : ");
		n+=scan.nextInt();
		newArr = new int[n];
		for(int i=0;i<arr.length;i++)
			newArr[i]=arr[i];
		System.out.println("Enter values : ");
		for(int i=arr.length;i<n;i++)
			newArr[i]=scan.nextInt();
		printArr(newArr);
		scan.close();
	}
}