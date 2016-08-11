public class bubbleSort{
	
	static int[] getArray(){
		int[] arr = {4,2,6,7,1,3,5,9,8};
		return arr;
	}

	static void sort(int[] arr){
		for(int i=0;i<arr.length;i++)
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					//swap
					int t=arr[j];
					arr[j]=arr[i];
					arr[i]=t;
				}
			}
	}

	static void printarr(int[] arr){
		for(int i:arr)
			System.out.print(i+" ");
		System.out.println();
	}

	public static void main(String[] args) {
		int[] a = getArray();
		System.out.println("Before :");
		printarr(a);
		sort(a);
		System.out.println("After :");
		printarr(a);
	}
}