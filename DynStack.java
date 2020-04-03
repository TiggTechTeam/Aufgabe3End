package K;
//Jahreiss, Kevin; Karasz, David; Urban, Melanie; 
public class DynStack<E> {

	private Node head;

	//constructor, creats an empty stack
	public DynStack() {
		head = null;
	}

	//inserts item at the top of this stack
	public void push(E item) {
		Node p = new Node(item);
		p.next = head;
		head = p;
	}

	//returns the top item of this stack and removes it
	//reutrns null, if this stack is empty
	public Node pop() {
		if(head == null)
			return null;
		Node p = head;
		head = head.next;
		return p;
	}

	//returns the top item of this stack without removing it
	//returns null, if this stack is empty
	public Node peek() {
		return head;
	}

	//returns true if this stack contains no elements
	public boolean isEmpty() {
		return head == null;
	}

	//returns the number of elements in this stack
	public int size() {
		int n = 0;
		Node p = head;
		while (p != null) {
			n++;
			p = p.next;
		}
		return n;
	}

	//returns the position of item on this stack, the top positon has count 0 
	//returns -1 if item is not on this stack; compares items with equals!
	public int contains(E item) {
		int n = 0;
		Node p = head;
		if(p != null) {
			while(p != null && !p.data.equals(item)) {
				n++;
				if(p.data.equals(item))
					return n;
				p = p.next;
			}
		}
		if(p == null)
			n = -1;
		return n;
	}

	//returns the position of item on this stack, the top positon has count 0 
	//returns -1 if item is not on this stack; compares items with equals!
	public int amountOf(E item) {
		int n = 0;
		Node p = head;
		while (p != null) {
			if (p.data.equals(item))
				n++;
			p = p.next;
		}
		return n;
	}

	//returns a String-representation of this stack as
	//[item0, item1, ...] with item0 as the top item
	public String toString() {
		String s = "[";
		Node p = head;
		if (p != null) {
			s = s + p.toString();
			p = p.next;
		}
		while (p != null) {
			s = s + "," + p.toString();
			p = p.next;
		}
		s = s + "]";
		return s;
	}
	
	//Inner Classes
	private class Node<E> {
		
		public E data;
		public Node next;
		
		public Node(E data) {
			this.data = data;
			this.next = null;
		}
		
		public String toString() {
			String s = data.toString();
			return s;
		}

	}
	
}
