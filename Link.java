public class Link {
	Object item;		//the item stored in this link
	Link successor;		//the link stored in this link
	
	Link(Object c, Link s) {
		item = c;
		successor = s;
	}
}
