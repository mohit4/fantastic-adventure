import java.util.Scanner;

public class strToInt{

	static int getInt(String s){
		int num=0;
		//note that string is not
		//iterable, so we need to convert it to char array
		for(char c:s.toCharArray()){
			num*=10;
			num+=(c-'0');
		}
		return num;
	}

	//assuming there are only 0-9 in string
	static String getStr(int n){
		int d;
		String res="";
		while(n>0){
			d = n%10;
			res = ((char)(d+'0')) + res;
			n/=10; 
		}
		return res;
	}

	public static void main(String[] args) {
		String s;
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		s = getStr(n);
		System.out.println("Extracted "+s);
	}
}