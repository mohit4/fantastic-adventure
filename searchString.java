import java.util.Scanner;

public class searchString{
	public static void main(String[] args) {
		String str[] = {
			"this is to inform all the people.",
			"after 10 o'clock this night.",
			"the annual purge will commence.",
			"those who are weak, are adviced to",
			"bury themselves in their homes.",
			"and those who have it in them,",
			"are welcome to join the brutal session.",
			"your's truly - The Foundation Fathers"
		};
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		String rep = scan.next();
		scan.close();
		System.out.println("----------");
		for(int i=0;i<str.length;i++){
			if(str[i].contains(s+" ")){
				//StringBuilder sb = new StringBuilder(str[i]);
				//sb.replace(str[i].indexOf(s),str[i].indexOf(s)+s.length()-1,rep);
				String t = str[i];
				str[i]=t.substring(0,t.indexOf(s));
				str[i]+=rep;
				str[i]+=t.substring(t.indexOf(s)+s.length());
				i--;
				continue;
			}
		}

		//print the array
		for(String i:str)
			System.out.println(i);
		System.out.println();
	}
}