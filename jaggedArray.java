public class jaggedArray{
	public static void main(String[] args) {
		int[][] a = {
			{1,5,7,8},
			{3,4,5},
			{2,2}
		};

		//print all the values
		for(int[] i:a){
			for(int j:i)
				System.out.print(j+" ");
			System.out.println();
		}
	}
}