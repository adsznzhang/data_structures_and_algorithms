/**
 * A link used to (recursively) construct a linked list.
 * @author xyu974
 * @version 1.0
 */
public class Link {
	
	/**
	 * Item stored in this link. 
	 */
	Object item;
	
	/**
	 * Reference to the rest of the list. 
	 */
	Link successor;
	
	/**
	 * Create a new link. 
	 * @param c
	 * @param s
	 */
	public Link(Object o, Link s){
		item = o;
		successor = s;
	}
}
