public class nineQueen{

	//global private variables to this class
	private int[] col,upFree,downFree,coln;
	private int sol,row;

	public nineQueen(){
		col = new int[8];
		upFree = new int[15];
		downFree = new int[15];
		coln = new int[8];
		row = -1;
	}

	protected void showQueens(){
		row++;
		//check all columns
		for(int i=0;i<col.length;i++){
			//if slot is columnwise
			//and diagonalwise free
			if((col[i]==0)&&(upFree[i+row]==0)&&(downFree[row-i+7]==0)){
				//write the column no indicating position
				//of queen in that row
				coln[row]=i;

				//mark column and diagonal positions
				//as not free
				col[i]=1;
				upFree[i+row]=1;
				downFree[row-i+7]=1;

				//if combinations for all rows are
				//complete
				if(row>=7){
					sol++;
					System.out.println("\n\nSolution #"+sol);

					for(int r=0;r<=7;r++){
						System.out.println();
						for(int c=0;c<col.length;c++){
							if(c==coln[r])
								System.out.print("Q");
							else
								System.out.print(".");
						}
					}
				}
				else
					showQueens();

				//unmark the column and diagonal positions
				col[coln[row]]=0;
				upFree[row+coln[row]]=0;
				downFree[row-coln[row]+7]=0;
			}
		}
		row--;
	}

	public static void main(String[] args) {
		nineQueen n = new nineQueen();
		n.showQueens();
	}
}