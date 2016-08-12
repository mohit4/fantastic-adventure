public class reverseStrings{
	public static void main(String[] args) {
		String str[] = {
			"Hear me roar",
			"Ours is the fury",
			"Fire and Blood",
			"Winter is coming",
			"Knowledge is power",
			"What is dead, may never die",
			"Together we stands"
		};
		//print the strings in reverse order
		for(String x:str){
			StringBuilder sb = new StringBuilder(x);
			sb = sb.reverse();
			System.out.println(sb.toString());
		}
	}
}