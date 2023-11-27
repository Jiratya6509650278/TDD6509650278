package core;

public class Stack implements Istack 
{
	
	private int size;		
	private int top = -1;	
	private Object[] stack;
	
	Stack(int size){
		this.size = size;
		stack = new Object[size];
		
	}
	@Override
	public int getsize() {
		return this.top + 1;
	}

	@Override
	public boolean IsEmpty() {
		return top == -1;
	}

	@Override
	public boolean IsFull() {
		return top == size-1;
	}

	@Override
	public void push(Object ele) throws Exception {
		if(IsEmpty()) {
			top++;
			stack[top] = ele;
			return;
		}
		if(IsFull()) {
			throw new Exception("Stack is Full");		
			}
		if(!(ele.getClass().getName() == top().getClass().getName())) {
			throw new Exception("All elements in the stack must be of the same type");
		}
		
		top++;
		stack[top] = ele;
		
	}

	@Override
	public Object pop() {
		top--;
		return stack[top+1];
	}
	@Override
	public Object top() {
		if(IsEmpty()) {
			return -1;
		}
		return stack[top];
	}
}