public class arrayAccess{
	public static void main(String[] args) {
		//to demonstrate different methods to
		//access an array
		int[] arr = {1,3,7,3,8,2,9};
		System.out.println("Values : ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.println("\nSquared : ");
		for(int i:arr)
			System.out.print(i*i+" ");
		System.out.println();
	}
}