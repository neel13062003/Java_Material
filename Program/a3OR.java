import java.lang.Exception.*;

class Stack{
	private int top;
	private int size;
	private int arr[];
	
	Stack(){
		top = -1;
		size = 5;
		arr = new int[size];
	}
	
	public void push(int x){
		try{
			top++;
			arr[top] = x;
		}
		catch(Exception e){
			System.out.println("You Can't Push : "+x+".\nStack is Full:)");
		}
	}
	
	public void pop(){
		int ele;
		try{
			if(top < 0) ele = arr[-1];
			top--;
		}
		catch(Exception e){
			System.out.println("You Can't pop. Stack is Empty:)");
		}
	}
}

public class a3OR{
	public static void main(String[] arg){
		Stack st = new Stack();
		st.pop(); // generates Exception
		
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		st.push(60); // generates Exception
	}
}