package datastr;

public class MyLinkedList<T> {
    private MyListNode<T> first = null;
    private MyListNode<T> last = null;
    private int counter = 0;

    public boolean isEmpty() {
        return counter == 0;
    }

    public int howManyElements() {
        return counter;
    }

    public void add(T element) {
        // TODO: Fix error
//      if (element == null) throw new Exception("Slay");

        MyListNode<T> newNode = new MyListNode<T>(element);

        if (isEmpty()) {
            first = newNode;
        } else {
            newNode.setPrevious(last);
            last.setNext(newNode);
        }

        last = newNode;
        counter++;
    }

    public void print() {
        // TODO: Fix error
//        if (isEmpty()) throw new Exception("Slay");
        MyListNode<T> temp = first;
        
        for (int i = 0; i < counter; i++) {
            System.out.print(temp + " ");
            temp = temp.getNext();
        }
        
        System.out.println();
    }
}
