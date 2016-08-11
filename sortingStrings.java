import java.util.Scanner;

public class sortingStrings{

	static void sortStrings(String[] strings){
		for(int i=0;i<strings.length;i++){
			for(int j=i+1;j<strings.length;j++){
				if(strings[i].compareTo(strings[j])>0){
					String temp = strings[i];
					strings[i] = strings[j];
					strings[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		scan.nextLine();
		String[] strings = new String[n];
		for(int i=0;i<n;i++)
			strings[i]=scan.nextLine();
		//sorting the strings
		sortStrings(strings);
		//printing sorted strings;
		System.out.println("----------");
		for(String s:strings)
			System.out.println(s);
		scan.close();
	}
}