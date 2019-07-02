
public class DCList {
	
	public Node last = new Node(null, null, null);
	public Node first = this.last;
	public int Size;
	
	public boolean empty() {
		return this.first == this.last;
	}
	
	public void Print() {
		String text = "[";
		Node prev = this.first;
		Node current = this.first.next;
		while (!(current == null)) {
			if (current.next != null) {
				text += current.item;
				text += ", ";
			}
			else {
				text += current.item;
			}
			prev = current;
			current = prev.next;
		}
		text += "]";
		
		System.out.println(text);
	}
	
	public void Insert(Object item) {
		this.last.next = new Node(this.last, item, null);
		this.last = this.last.next;
		this.Size += 1;
	}
	
	public Object Remove(Object item) {
		if (this.empty()) { return null; };
		Node aux = this.first.next;
		while (!(aux == null) && aux.item != item) {
			aux = aux.next;
		}
		if (aux == null) { return null; };
		
		item = aux.item;
		if (aux == this.last) {
			this.last = aux.prev;
		}
		else {
			aux.next.prev = aux.prev;
		}
		aux.prev.next = aux.next;
		aux.next = null;
		aux.prev = null;
		
		return item;
	}
}
