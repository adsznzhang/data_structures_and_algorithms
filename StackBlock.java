/**
 * Block implementation of a stack.
 * @author xyu974
 * @version 1.0
 */
public class StackBlock implements Stack{
	
	Object[] mystack;
	int last;
	
	/**
	 * Create an empty stack of size s
	 * @param size size of stack
	 **/
	public StackBlock(int size) {
		mystack = new Object[size];
		last = -1;
	}
	

	/**
	 * Return true iff the stack is empty, false otherwise
	 **/
	public boolean isEmpty() {
		return last == -1;
	}
	
	/**
	 * Return true iff the stack is full, false otherwise
	 **/
	public boolean isFull() {
		return last == mystack.length - 1;
	}
	
	/**
	 * Push object onto the top of the stack
	 * @param o the object to push
	 * @throws Overflow
	 **/
	public void push(Object o) throws RuntimeException {
		if (!isFull()) {
			last++;
			mystack[last] = o;
		}
		else throw new RuntimeException("pushing to full stack");
	}
	
	/**
	 * Examine the object on top of the stack
	 * @return the top item
	 * @throws Underflow
	 **/
	public Object examine() throws RuntimeException {
		if (!isEmpty()) {
			return mystack[last];
		}
		else throw new RuntimeException("examining empty stack");
	}
	
	/**
	 * Remove and return the object on top of the stack
	 * @return the top item
	 * @throws Underflow
	 **/
	public Object pop() throws RuntimeException {
		if (!isEmpty()) {
			Object top = mystack[last];
			mystack[last] = null;
			last--;
			return top;
		}
		else throw new RuntimeException("poping from empty stack");
	}
	
	/**
	 * construct a string representation of the stack
	 * @return the string representation
	 */
	public String toString(){
		String result = "";
		for (Object temp:mystack) {
			result = result + temp;
		}
		return result;
	}
}