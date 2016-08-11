public class onStringBuilder{
	public static void main(String[] args) {
		StringBuilder S = new StringBuilder("This is my string.");
		//appending to string

		S.append("And I will tell you the value of pi. It is ");
		S.append(3.141592654);

		//to convert it to a string
		System.out.println(S.toString());

		//to replace
		S.replace(11,16,"value ");

		//S.capacity(),
		//S.deleteCharAt(int index)
		//S.delete(int start,int end,string s)

		System.out.println(S.toString());
	}
}