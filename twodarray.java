import java.util.Scanner;

public class twodarray{

	static int getMax(int[] arr){
		int max=-1,max_index=-1;
		for(int i=0;i<arr.length;i++)
			if(arr[i]>max){
				max=arr[i];
				max_index=i;
			}
		return max_index;
	}

	public static void main(String[] args) {
		int[][] matrix;
		int m,n;
		Scanner scan = new Scanner(System.in);
		m=scan.nextInt();
		n=scan.nextInt();
		matrix = new int[m][n];
		for(int r=0;r<m;r++){
			for(int c=0;c<n;c++){
				matrix[r][c]=scan.nextInt();
			}
		}
		scan.close();
		//now we call getMax for each row
		int max_of_all=-1;
		int mx_r,mx_c;
		mx_r=mx_c=-1;
		for(int r=0;r<m;r++){
			int c=getMax(matrix[r]);
			if(c<0)
				continue;
			if(max_of_all<matrix[r][c]){
				max_of_all=matrix[r][c];
				mx_r = r;
				mx_c = c;
			}
		}
		System.out.println(mx_r+" "+mx_c+" "+max_of_all);
	}
}