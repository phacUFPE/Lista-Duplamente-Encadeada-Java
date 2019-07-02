
public class Node {
	
	public Node prev = null;
	public Object item;
	public Node next = null;
	
	public Node(Node prev, Object item, Node next) {
		this.prev = prev;
		this.item = item;
		this.next = next;
	}
	
	public Object getItem() {
		return this.item;
	}
}
