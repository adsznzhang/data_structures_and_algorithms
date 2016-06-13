/**
 * Window for linked representations of lists
 * @author xyu974
 * @version 1.0
 */
public class WindowLinked {
	
	/**
	 * the Link the window refers to
	 */
	public Link link;
	
	/**
	 * create a new empty window
	 */
	public WindowLinked(){
		link = null;
	}
	
	/**
	 * create a new window
	 * @param l
	 */
	public WindowLinked(Link l){
		link = new Link(null, l);
	}
}
