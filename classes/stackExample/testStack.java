public class testStack{
	public static void main(String[] args) {
		Stack S = new Stack(10);
		S.push(10);
		S.push(20);
		S.push(30);
		System.out.println(S.top());
		S.pop();
		System.out.println(S.top());
		S.pop();
		System.out.println(S.top());
	}
}