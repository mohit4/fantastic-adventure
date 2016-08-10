//code is not working

public class quickSort{

	//if you found a swap alternative 
	//type it here

	static int partition(int[] arr,int low,int high){
		//get the pivot element
		int pivot = arr[high];
		int p_index = low-1;
		for(int i=low;i<=high-1;i++){
			if(arr[i]<=pivot){
				p_index++;
				//swap(arr[i],arr[p_index]);
				int t=arr[i];
				arr[i]=arr[p_index];
				arr[p_index]=arr[i];
			}
		}
		//swap(arr[p_index+1],arr[high]);
		int t=arr[p_index+1];
		arr[p_index+1]=arr[high];
		arr[high]=t;
		return p_index+1;
	}

	static void quickSort(int[] arr,int low,int high){
		if(low<high){
			int pi = partition(arr,low,high);
			quickSort(arr,low,pi-1);
			quickSort(arr,pi+1,high);
		}
	}

	static void printArr(int[] arr,int len){
		for(int i=0;i<len;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}

	public static void main(String[] args){
		int[] arr = {2,4,6,1,9,3,0};
		int len = 7;
		printArr(arr,len);
		quickSort(arr,0,len-1);
		printArr(arr,len);
	}
}