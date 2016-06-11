/**
 * Linked stack.
 * @author xyu974
 * @version 1.0
 */
public class StackLinked implements Stack{
	
	Link first;
	
	/**
	 * Create a linked stack and initialise.
	 */
	public StackLinked(){
		first = null;
	}
	
	/**
	 * Test whether the stack is empty.
	 * @return true if the stack is empty, false otherwise
	 */
	public boolean isEmpty(){
		return first == null;
	}
	
	/**
	 * Examine the item on the top of the stack.
	 * @return the top item
	 * @throws RuntimeException
	 */
	public Object examine() throws RuntimeException{
		if (!isEmpty()) return first.item;
		else throw new RuntimeException("examing empty stack");
	}
	
	/**
	 * Insert an object at the front of the stack
	 * @param o - the new object
	 */
	public void push (Object o){
		first = new Link(o, first);
	}
	
	/**
	 * Remove the item at the top of the stack.
	 * @return the removed item
	 * @throws RuntimeException
	 */
	public Object pop() throws RuntimeException{
		if (!isEmpty()){
			Object result = first;
			first = first.successor;
			return result;
		}
		else throw new RuntimeException("poping from empty stack");
	}
	
	/**
	 * construct a string representation of the stack
	 * @return the string representation
	 */
	public String toString(){
		Link cursor = first;
		String result = "";
		while (cursor != null){
			result = result + cursor.item;
			cursor = cursor.successor;
		}
		return result;
	}
}
