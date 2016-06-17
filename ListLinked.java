/**
 * Singly linked implementation of a List ADT
 * @author xyu974
 * @version 1.0
 */
public class ListLinked implements List{
	
	private Link before;
	private Link after;
	
	/**
	 * create a new list
	 */
	public ListLinked(){
		after = new Link(null, null);
		before = new Link(null, after);
	}
	
	/**
	 * check if the list is empty
	 * @return true if the list is empty, false otherwise
	 */
	public boolean isEmpty(){
		return before.successor == after;
	}
	
	/**
	 * check if the window is over the before-first position
	 * @param w - the window
	 * @return true if the window is over before-first, false otherwise
	 */
	public boolean isBeforeFirst(WindowLinked w){
		return w.link == before;
	}
	
	/**
	 * check if the window is over the after-last position
	 * @param w - the window
	 * @return true if the window is over after-last, false otherwise
	 */
	public boolean isAfterLast(WindowLinked w){
		return w.link == after;
	}
	
	/**
	 * put a window over before-first position
	 * @param w - the window to place
	 */
	public void beforeFirst(WindowLinked w){
		w.link = before;
	}
	
	/**
	 * put a window over after-last position
	 * @param w - the window to place
	 */
	public void afterLast(WindowLinked w){
		w.link = after;
	}
	
	/**
	 * move a window to the next position
	 * @param w - the window
	 * @throws RuntimeException - if the window is past the end of the list
	 */
	public void next(WindowLinked w) throws RuntimeException{
		if(!isAfterLast(w)) w.link = w.link.successor;
		else throw new RuntimeException("calling next after list end");
	}
	
	/**
	 * move a window to the previous position
	 * @param w - the window
	 * @throws RuntimeException - if the window is before the start of the list
	 */
	public void previous(WindowLinked w) throws RuntimeException{
		if(!isBeforeFirst(w)){
			
			// start at the first sentinel cell and traverse the list to current window
			// while storing the previous position
			Link current = before.successor;
			Link previous = before;
			while(current != w.link){
				previous = current;
				current = current.successor;
			}
			w.link = previous;
		}
		else throw new RuntimeException("calling previous before start of list");
	}
	
	/**
	 * insert an item after a window
	 * @param e - the item to insert
	 * @param w - the window
	 * @throws RuntimeException - if the window is past the end of the list
	 */
	public void insertAfter(Object e, WindowLinked w) throws RuntimeException{
		w.link.successor = new Link(e, w.link.successor);
		if(isAfterLast(w)) after = w.link.successor;
	}
	
	/**
	 * insert an item before a window
	 * @param e - the item to insert
	 * @param w - the window
	 * @throws RuntimeException - if the window is before the start of the list
	 */
	public void insertBefore(Object e, WindowLinked w) throws RuntimeException{
		if (!isBeforeFirst(w)){
			w.link.successor = new Link(w.link.item, w.link.successor);
			if (isAfterLast(w)) after = w.link.successor;
			w.link.item = e;
			w.link = w.link.successor;
		}
		else throw new RuntimeException("inserting before start of list");
	}
	
	/**
	 * examine the object under a window
	 * @param w - the window
	 * @return the object under the window
	 * @throws RuntimeException - if the window is outside the list
	 */
	public Object examine(WindowLinked w) throws RuntimeException{
		if(!isBeforeFirst(w)){
			if(!isAfterLast(w)){
				return w.link.item;
			}
			else throw new RuntimeException("examining after end of list");
		}
		else throw new RuntimeException("examing before start of list"); 
	}
	
	/**
	 * replace the object under a window
	 * @param e - the new object
	 * @param w - the window
	 * @return the object previously under the window
	 * @throws RuntimeException - if the window is outside the list
	 */
	public Object replace(Object e, WindowLinked w) throws RuntimeException{
		if(!isBeforeFirst(w)){
			if(!isAfterLast(w)){
				Object result = w.link.item;
				w.link.item = e;
				return result;
			}
			else throw new RuntimeException("replacing after end of list");
		}
		else throw new RuntimeException("replacing before start of list"); 
		
	}
	
	/**
	 * delete and return the object under a window, and place window over the next item
	 * @param w - the window
	 * @return the object previously under the window
	 * @throws RuntimeException - if the window is outside the list
	 */
	public Object delete(WindowLinked w) throws RuntimeException{
		if(!isBeforeFirst(w)){
			if(!isAfterLast(w)){
				Object result = w.link.item;
				this.previous(w);
				w.link.successor = w.link.successor.successor;
				return result;
			}
			else throw new RuntimeException("deleting after end of list");
		}
		else throw new RuntimeException("deleting before start of list"); 
	}

}
