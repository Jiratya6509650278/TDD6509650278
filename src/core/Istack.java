package core;

public interface Istack 
{
	int getsize();
	boolean IsEmpty();
	boolean IsFull();
	void push(Object elm)throws Exception;
	Object top();
	Object pop();
}
