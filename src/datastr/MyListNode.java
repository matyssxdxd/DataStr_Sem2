package datastr;

public class MyListNode<Ttype> {
//TODO
	//1. variables - element, next un previous
	private Ttype element;
	private MyListNode next = null;
	private MyListNode previous = null;
	//2. get and set
	public Ttype getElement() {
		return element;
	}
	public void setElement(Ttype element) {
		if(element != null)
			this.element = element;
		else
			this.element = (Ttype) new Object();
	}
	public MyListNode getNext() {
		return next;
	}
	public void setNext(MyListNode next) {
		this.next = next;
	}
	public MyListNode getPrevious() {
		return previous;
	}
	public void setPrevious(MyListNode previous) {
		this.previous = previous;
	}

	//3. constructors
	public MyListNode (Ttype element) {
		setElement(element);
	}
	
	//4. toString
	public String toString() {
		return ""+element;
	}
	
}
