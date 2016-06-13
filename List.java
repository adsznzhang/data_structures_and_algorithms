/**
 * Interface for List ADTs that use a window for Links
 * @author xyu974
 * @version 1.0
 */
public interface List {
	
	/**
	 * check if the list is empty
	 * @return true if the list is empty, false otherwise
	 */
	public boolean isEmpty();
	
	/**
	 * check if the window is over the before-first position
	 * @param w - the window
	 * @return true if the window is over before-first, false otherwise
	 */
	public boolean isBeforeFirst(WindowLinked w);
	
	/**
	 * check if the window is over the after-last position
	 * @param w - the window
	 * @return true if the window is over after-last, false otherwise
	 */
	public boolean isAfterLast(WindowLinked w);
	
	/**
	 * put a window over before-first position
	 * @param w - the window to place
	 */
	public void beforeFirst(WindowLinked w);
	
	/**
	 * put a window over after-last position
	 * @param w - the window to place
	 */
	public void afterLast(WindowLinked w);
	
	/**
	 * move a window to the next position
	 * @param w - the window
	 * @throws RuntimeException - if the window is past the end of the list
	 */
	public void next(WindowLinked w) throws RuntimeException;
	
	/**
	 * move a window to the previous position
	 * @param w - the window
	 * @throws RuntimeException - if the window is before the start of the list
	 */
	public void previous(WindowLinked w) throws RuntimeException;
	
	/**
	 * insert an item after a window
	 * @param e - the item to insert
	 * @param w - the window
	 * @throws RuntimeException - if the window is past the end of the list
	 */
	public void insertAfter(Object e, WindowLinked w) throws RuntimeException;
	
	/**
	 * insert an item before a window
	 * @param e - the item to insert
	 * @param w - the window
	 * @throws RuntimeException - if the window is before the start of the list
	 */
	public void insertBefore(Object e, WindowLinked w) throws RuntimeException;
	
	/**
	 * examine the object under a window
	 * @param w - the window
	 * @return the object under the window
	 * @throws RuntimeException - if the window is outside the list
	 */
	public Object examine(WindowLinked w) throws RuntimeException;
	
	/**
	 * replace the object under a window
	 * @param e - the new object
	 * @param w - the window
	 * @return the object previously under the window
	 * @throws RuntimeException - if the window is outside the list
	 */
	public Object replace(Object e, WindowLinked w) throws RuntimeException;
	
	/**
	 * delete and return the object under a window, and place window over the next item
	 * @param w - the window
	 * @return the object previously under the window
	 * @throws RuntimeException - if the window is outside the list
	 */
	public Object delete(WindowLinked w) throws RuntimeException;
}
