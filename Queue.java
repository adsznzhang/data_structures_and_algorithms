/**
 * Queue interface.
 * @author xyu974
 * @version 1.0
 */
public interface Queue {
	
	/**
	 * test whether the queue is empty
	 * @return true if the queue is empty, false otherwise
	 */
	public boolean isEmpty();
	
	/**
	 * examine the item at the front of the queue
	 * @return the first item
	 * @throws RuntimeException
	 */
	public Object examine() throws RuntimeException;
	
	/**
	 * insert an item at the back of the queue
	 * @param a - the item to insert
	 */
	public void enqueue(Object a);
	
	/**
	 * remove the item at the front of the queue
	 * @return the removed item
	 * @throws RuntimeException
	 */
	public Object dequeue() throws RuntimeException;
}
