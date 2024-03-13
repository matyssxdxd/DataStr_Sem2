package datastr;

public class MyListNode<T> {
    private T element;
    private MyListNode<T> next = null;
    private MyListNode<T> previous = null;

    public T getElement() {
        return element;
    }

    public MyListNode<T> getNext() {
        return next;
    }

    public MyListNode<T> getPrevious() {
        return previous;
    }

    public void setElement(T element) {
        this.element = element != null ? element : (T) new Object();
    }

    public void setNext(MyListNode<T> next) {
        this.next = next;
    }

    public void setPrevious(MyListNode<T> previous) {
        this.previous = previous;
    }

    public MyListNode(T element) {
        setElement(element);
    }

    public String toString() {
        return "" + element;
    }
}
