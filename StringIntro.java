public class StringIntro{
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "Hello";
		if(s1==s2)
			System.out.println(s1+" is equal to "+s2);
		String s3 = new String("Mohit");
		String s4 = new String("Mohit");
		if(s3!=s4)
			System.out.println(s3+" is not referring to same object as "+s4);
		if(s3.equals(s4))
			System.out.println("But "+s3+" and "+s4+" are equal!");
	}
}