//java program to print roman nos between 0 to 3999

import java.util.*;

public class roman {

	static String getRoman(int no) {
		//to return the result
		String res = "";
		String l,m,h;
		l=m=h="";
		int p=0;
		while(no>0) {
			String temp = "";
			int digit = no%10;
			no/=10;
			switch(p) {
				case 0: l="I";m="V";h="X";break;
				case 1: l="X";m="L";h="C";break;
				case 2: l="C";m="D";h="M";break;
				case 3: l="M";
			}
			p++;
			switch(digit) {
				case 1:case 2:case 3:
					for(int i=0;i<digit;i++)
						temp=temp+l;
					break;
				case 4: temp=l+m;break;
				case 5: temp=m;break;
				case 6:case 7:case 8:
					temp=m;
					for(int i=0;i<digit-5;i++)
						temp+=l;
					break;
				case 9: temp=l+h;
			}
			res = temp + res;
		}
		return res;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a no : ");
		int no = scan.nextInt();
		String res = getRoman(no);
		System.out.println("Roman no is "+res);
	}

}