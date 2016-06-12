/**
 * Linked list representation of a queue.
 * @author xyu974
 * @version 1.0
 */
public class QueueLinked implements Queue{
	
	/**
	 * the front of the queue
	 */
	private Link first;
	
	/**
	 * the back of the queue
	 */
	private Link last;
	
	/**
	 * initialise a new queue
	 */
	public QueueLinked(){
		first = null;
		last = null;
	}
	
	/**
	 * test whether the queue is empty
	 * @return true if the queue is empty, false otherwise
	 */
	public boolean isEmpty(){
		return first == null;
	}
	
	/**
	 * examine the item at the front of the queue
	 * @return the first item
	 * @throws RuntimeException
	 */
	public Object examine() throws RuntimeException{
		if (!isEmpty()) return first.item;
		else throw new RuntimeException("examining empty queue");
	}
	
	/**
	 * insert an item at the back of the queue
	 * @param a - the item to insert
	 */
	public void enqueue(Object a){
		if (isEmpty()){
			first = new Link(a, null);
			last = first;
		}
		else {
			last.successor = new Link(a, null);
			last = last.successor;
		}
	}
	
	/**
	 * remove the item at the front of the queue
	 * @return the removed item
	 * @throws RuntimeException
	 */
	public Object dequeue() throws RuntimeException{
		if (!isEmpty()){
			Object result = first.item;
			first = first.successor;
			if(isEmpty()) last = null;
			return result;
		}
		else throw new RuntimeException("dequeuing from empty queue");
	}
}
