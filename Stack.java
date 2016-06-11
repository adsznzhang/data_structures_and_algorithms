/**
 * Stack interface.
 * @author xyu974
 * @version 1.0
 */
public interface Stack {
	
	/**
	 * Examine the item on the top of the stack.
	 * @return the top item
	 * @throws RuntimeException
	 */
	public Object examine() throws RuntimeException;
	
	/**
	 * Test whether the stack is empty.
	 * @return true if the stack is empty, false otherwise
	 */
	public boolean isEmpty();
	
	/**
	 * Remove the item at the top of the stack.
	 * @return the removed item
	 * @throws RuntimeException
	 */
	public Object pop() throws RuntimeException;
	
	/**
	 * Insert an item on the top of the stack.
	 * @param a - the item to insert
	 * @throws RuntimeException
	 */
	public void push(Object a) throws RuntimeException;
	
	/**
	 * construct a string representation of the stack
	 * @return the string representation
	 */
	public String toString();
}
