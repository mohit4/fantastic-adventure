public class Stack{
	protected int[] data;
	protected int capacity;
	protected int top;

	public Stack(int cap){
		capacity = cap;
		top = -1;
		data = new int[cap];
	}

	public void push(int x){
		data[++top]=x;
	}

	public void pop(){
		top--;
	}

	public int top(){
		return data[top];
	}
}