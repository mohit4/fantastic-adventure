public class AboutStrings{
	public static void main(String[] args) {
		String s1 = "Hello, world!";
		//getting length of the string
		//and character at i index
		for(int i=0;i<s1.length();i++)
			System.out.print(s1.charAt(i)+" ");
		System.out.println();
		
		//for concatenation
		String s2 = "I said, ".concat(s1);
		System.out.println(s2);

		//will replace all o with i
		System.out.println(s1.replace("o","i"));
		
		//assigning value of character sequence
		char[] charr = {'a','e','i','o','u'};
		String s3 = String.copyValueOf(charr);
		System.out.println(s3);

		//converting a string to char array
		char[] ch2 = "This is a string.".toCharArray();
		for(char c:ch2)
			System.out.print(c+" ");

		//lexicographical comparison of strings
		String s4 = "Main";
		String s5 = "Many";
		if(s4.compareTo(s5)<0){
			System.out.println("Order is : \n"+s4+"\n"+s5);
		}
		else
			System.out.println("Order is : \n"+s5+"\n"+s4);	
		
		//uppercase and lowercase
		String s6 = "lOrEm IpSuM";
		System.out.println(s6.toUpperCase());
		System.out.println(s6.toLowerCase());
		
		//first letter capital
		System.out.println(s6.substring(0,1).toUpperCase()+s6.substring(1).toLowerCase());

		//string formating
		String s7 = String.format("value of fun(%d) is %f.",4,3.1415);
		System.out.println(s7);

		//ignore case for string comparison
		String s8 = "Mohit";
		String s9 = "mOhIt";
		if(s8.compareToIgnoreCase(s9)==0)
			System.out.println(s8+" and "+s9+" are equal!");
		
		System.out.println();
	}
}