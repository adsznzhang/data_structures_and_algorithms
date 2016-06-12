/**
 * Block implementation of Queue.
 * @author xyu974
 * @version 1.0
 */
public class QueueBlock implements Queue{
	
	/**
	 * an array of queue items
	 */
	private Object[] items;
	
	/**
	 * index for the first and last item
	 */
	private int first;
	private int last;
	
	/**
	 * initialise a new queue
	 * @param size - the size of the queue
	 */
	public QueueBlock(int size){
		items = new Object[size];
		first = 0;
		last = -1;
	}
	
	/**
	 * test whether the queue is empty
	 * @return true if the queue is empty, false otherwise
	 */
	public boolean isEmpty(){
		return first == last + 1;
	}
	
	/**
	 * test whether the queue is full
	 * @return true if the queue is full, false otherwise
	 */
	public boolean isFull(){
		return last == items.length - 1;
	}
	
	/**
	 * examine the item at the front of the queue
	 * @return the first item
	 * @throws RuntimeException
	 */
	public Object examine() throws RuntimeException{
		if (!isEmpty()) return items[first];
		else throw new RuntimeException("examing empty queue");
	}
	
	/**
	 * insert an item at the back of the queue
	 * @param a - the item to insert
	 * @throws RuntimeException
	 */
	public void enqueue(Object o) throws RuntimeException{
		if(!isFull()) {
			last++;
			items[last] = o;
		}
		else throw new RuntimeException("enqueuing to full queue");
	}
	
	/**
	 * remove the item at the front of the queue
	 * @return the removed item
	 * @throws RuntimeException
	 */
	public Object dequeue() throws RuntimeException{
		if (!isEmpty()){
			Object result = items[first];
			for(int i = 0; i < last; i++){
				items[i] = items[i+1];
			}
			last--;
			return result;
		}
		else throw new RuntimeException("dequeuing from empty queue");
	}
	
}
