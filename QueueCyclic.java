/**
 * A block implementation of cyclic queue (or cyclic buffer)
 * @author xyu974
 * @version 1.0
 */
public class QueueCyclic implements Queue{

	/**
	 * an array of queue items
	 */
	private Object[] items;
	
	/**
	 * index for the first and last item
	 */
	private int first;
	private int last;

	public QueueCyclic(int size){
		items = new Object[size];
		first = 0;
		last = size-1;
	}
	
	/**
	 * test whether the queue is empty
	 * @return true if the queue is empty, false otherwise
	 */
	public boolean isEmpty(){
		return first == (last+1) %items.length;
	}
	
	/**
	 * define queue as full when it contains items.length-1 elements
	 * test whether the queue is full
	 * @return true if the queue is full, false otherwise
	 */
	public boolean isFull(){
		return first == (last+2)%items.length;
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
	 * first and last must be incremented until they reach 
	 * the end of the array and then reduced to 0. 
	 * @param a - the item to insert
	 */
	public void enqueue(Object a){
		if (!isFull()){
			last = (last + 1) % items.length;
			items[last] = a;
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
			for (int i = 0; i < last; i++){
				items[i] = items[i+1];
			}
			last--;
			return result;
		}
		else throw new RuntimeException("dequeuing from empty queue");		
	}
}
